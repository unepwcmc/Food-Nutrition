package com.unep.wcmc.foodnutrition.service;

import com.unep.wcmc.foodnutrition.exception.InvalidPasswordException;
import com.unep.wcmc.foodnutrition.exception.UserAlreadyExistException;
import com.unep.wcmc.foodnutrition.exception.UserNotFoundException;
import com.unep.wcmc.foodnutrition.helper.MailUtils;
import com.unep.wcmc.foodnutrition.model.ForgetPasswordToken;
import com.unep.wcmc.foodnutrition.model.User;
import com.unep.wcmc.foodnutrition.model.UserRole;
import com.unep.wcmc.foodnutrition.repository.ForgetPasswordTokenRepository;
import com.unep.wcmc.foodnutrition.repository.UserRepository;
import com.unep.wcmc.foodnutrition.repository.UserRoleRepository;
import com.unep.wcmc.foodnutrition.support.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * User service api
 */
@Service
public final class UserService extends AbstractService<User, UserRepository> implements UserDetailsService {

    private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();

    @Autowired
    private UserRoleRepository userRoleRepo;

    @Autowired
    private ForgetPasswordTokenRepository passwordTokenRepository;

    @Autowired
    private Environment environment;

    @Autowired
    private MailUtils mailUtils;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User get(Long id) {
        User result = super.get(id);
        result.setPassword("");
        result.setActualPassword("");
        return result;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = repo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }
        detailsChecker.check(user);
        return user;
    }

    public User registerNewUser(User user) {
        validateUser(user, repo.findByEmail(user.getEmail()));
        validateUser(user, repo.findByUsername(user.getUsername()));
        final String role = user.getRole();
        user.setUserRole(getUserRole(role));
        user.setEnabled(true);
        return save(user);
    }

    @Override
    public User save(User user) {
        final String role = user.getRole();
        user.setUserRole(getUserRole(role));
        String passEncoded = passwordEncoder.encode(user.getPassword());
        user.setPassword(passEncoded);
        user.setLanguage("pt_BR");
        return super.save(user);
    }

    private void validateUser(User user, User other) {
        if ((user == null) || (other == null) || (user.getId().equals(other.getId()))) {
            return;
        }
        if (other.getEmail().equals(user.getEmail()) ||
                other.getUsername().equals(user.getUsername())) {
            throw new UserAlreadyExistException("User already exists");
        }
    }

    private UserRole getUserRole(String role) {
        UserRole userRole;
        final UserRole.RoleType adminRole = UserRole.RoleType.ADMIN;
        try {
            userRole = userRoleRepo.findByRole(role == null ? adminRole.name() : role);
        } catch (Exception e) {
            userRole = userRoleRepo.findByRole(adminRole.name());
        }
        return userRole;
    }

    public User findByEmail(String email) throws UserNotFoundException {
        final User user = repo.findByEmail(email);
        if (user == null) {
            throw new UserNotFoundException("user not found");
        }
        detailsChecker.check(user);
        return user;
    }

    public void forgetPassword(String email, String urlCallback) {
        final User user = repo.findByEmail(email);
        if (user == null) {
            throw new IllegalArgumentException("User email not found");
        }

        Map<String, Object> mailParameters = new HashMap<>();
        mailParameters.put("username", user.getFirstName());
        mailParameters.put("url", getUrl(user, urlCallback));

        String template = user.getLanguage().equals(User.PT_BR) ? MailUtils.FORGOT_PASSWORD_TEMPLATE_PT_BR : MailUtils.FORGOT_PASSWORD_TEMPLATE_EN_GB;

        mailUtils.sendEmail(email, environment.getProperty("support.email"), "Reset Password",template, mailParameters);
    }

    public User changePassword(User user, String password, String oldPassword) {
        if (!user.getPassword().equals(oldPassword)) {
            throw new InvalidPasswordException("Passwords do not match");
        }
        detailsChecker.check(user);

        String passwordEncoded = passwordEncoder.encode(password);
        user.setPassword(passwordEncoded);

        return repo.save(user);
    }

    public void resetPassword(String token, String password) {
        final ForgetPasswordToken passwordToken = passwordTokenRepository.findByToken(token);
        if (passwordToken == null) {
            throw new IllegalArgumentException("Invalid token");
        }
        final Calendar calendar = Calendar.getInstance();
        final Date expiryDate = passwordToken.getExpiryDate();
        if (expiryDate.before(calendar.getTime())) {
            throw new IllegalStateException("Reset Password Link expired");
        }
        final User user = passwordToken.getUser();
        String passwordEncoded = passwordEncoder.encode(password);
        user.setPassword(passwordEncoded);
        repo.save(user);
    }

    private String getUrl(User user, String urlCallback) {
        final String token = UUID.randomUUID().toString();
        final ForgetPasswordToken passwordToken = new ForgetPasswordToken(token, urlCallback, user);
        passwordTokenRepository.save(passwordToken);
        String result = String.format(urlCallback + "/#/reset/%s", token);
        if (!result.startsWith("http")) {
            result = "http://" + result;
        }
        return result;
    }

}

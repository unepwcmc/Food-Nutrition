package com.unep.wcmc.foodnutrition.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unep.wcmc.foodnutrition.model.User;
import com.unep.wcmc.foodnutrition.security.token.TokenProvider;
import com.unep.wcmc.foodnutrition.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Filter that intercepts any login/authentication operation
 *
 */
public final class LoginFilter extends AbstractAuthenticationProcessingFilter {

    private final TokenProvider tokenProvider;
    private final UserService userService;
    
    public LoginFilter(String urlMapping,
                       TokenProvider tokenAuthenticationService,
                       UserService userService,
                       AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(urlMapping, "POST"));
        this.tokenProvider = tokenAuthenticationService;
        this.userService = userService;
        setAuthenticationManager(authManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, 
                                                HttpServletResponse response)  throws AuthenticationException, IOException, ServletException {
        final User user = new ObjectMapper().readValue(request.getInputStream(), User.class);
        final UsernamePasswordAuthenticationToken loginToken = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
        loginToken.setDetails(user);
        return getAuthenticationManager().authenticate(loginToken);
    }
    
    @Override
    protected void successfulAuthentication(HttpServletRequest request, 
                                            HttpServletResponse response, 
                                            FilterChain chain, 
                                            Authentication authentication) throws IOException, ServletException {
        try {
            UserDetails authenticatedUser = userService.loadUserByUsername(authentication.getName());
            UsernamePasswordAuthenticationToken userAuthentication =
                    new UsernamePasswordAuthenticationToken(authenticatedUser.getUsername(),
                            authenticatedUser.getPassword(), authenticatedUser.getAuthorities());
            userAuthentication.setDetails(authenticatedUser);
            String token = tokenProvider.addAuthentication(response, userAuthentication);
            request.setAttribute(TokenProvider.AUTH_HEADER_NAME, token);
            SecurityContextHolder.getContext().setAuthentication(userAuthentication);
        } catch (InternalAuthenticationServiceException internalAuthenticationServiceException) {
            SecurityContextHolder.clearContext();
            logger.error("Internal authentication service exception", internalAuthenticationServiceException);
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        } catch (AuthenticationException authenticationException) {
            SecurityContextHolder.clearContext();
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authenticationException.getMessage());
        }
    }
}

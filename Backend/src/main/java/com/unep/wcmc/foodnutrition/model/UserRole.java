package com.unep.wcmc.foodnutrition.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unep.wcmc.foodnutrition.support.BaseEntity;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

/**
 * Model that defines application's roles
 *
 */
@Entity
@Table(name = "user_role", uniqueConstraints = { @UniqueConstraint(columnNames = { "role" }), @UniqueConstraint(columnNames = { "name" }) })
public class UserRole implements BaseEntity {
    
    public enum RoleType { ADMIN }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "userRoleId", fetch = FetchType.EAGER)
    private Set<Authority> authorities;
    
    public UserRole() {
        super();
    }

    public String getRole() {
        return role;
    }
    
    public String getName() {
    	return name;
    }
    
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return 41 * ((role == null) ? 1 : role.hashCode());
	}
    
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj == this) return true;
		if (obj.getClass() == getClass()) {
			final UserRole other = (UserRole)obj;
			return role == null ? other.role == null : role.equalsIgnoreCase(other.role);
		}
		return false;
	}

    @Override
    public String toString() {
        return role;
    }
}

package com.security;

import com.hibernate.dao.DaoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private ShaPasswordEncoder encoder;

    @Override
    public Authentication authenticate(final Authentication authentication) throws AuthenticationException {

        final String name = authentication.getName();
        final String password = authentication.getCredentials().toString();

        final String encodedPassword = encoder.encodePassword(password, "myHash");

        if (("admin".equals(name)) && ("admin".equals(password))) {
            return getPositiveAuth(name, password);
        }

        com.app.User user = DaoFactory.INSTANCE.getUserDAO().getUser(name, encodedPassword);

        if (name.equals(user.getLogin()) && encodedPassword.equals(user.getPassword())) {
            final List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
            grantedAuths.add(new SimpleGrantedAuthority(user.getRole()));
            if (user.getRole().equals("ROLE_ADMIN")) {
                grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
            }
            final UserDetails principal = new User(name, password, grantedAuths);
            final Authentication auth = new UsernamePasswordAuthenticationToken(principal, password, grantedAuths);
            return auth;
        }

        boolean ifUserExists = DaoFactory.INSTANCE.getUserDAO().ifExists(name, encodedPassword);

        if (ifUserExists) {
            return getPositiveAuth(name, password);
        } else {
            return null;
        }
    }

    private Authentication getPositiveAuth(String name, String password) {
        final List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        final UserDetails principal = new User(name, password, grantedAuths);
        final Authentication auth = new UsernamePasswordAuthenticationToken(principal, password, grantedAuths);
        return auth;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    public ShaPasswordEncoder getEncoder() {
        return encoder;
    }

    public void setEncoder(ShaPasswordEncoder encoder) {
        this.encoder = encoder;
    }


}
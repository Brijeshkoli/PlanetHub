package com.planetHub.service.framework;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.planetHub.entity.User;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    void updatePassword(User user);

    User save(User user);
}

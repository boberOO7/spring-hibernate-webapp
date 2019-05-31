package com.liakhovskyi.service;

import com.liakhovskyi.model.Role;
import com.liakhovskyi.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService extends UserDetailsService {

    User getByUsername(String username);

    User register(User user);

    List<Role> getAllRoles();

    List<User> getAllUsers();
}

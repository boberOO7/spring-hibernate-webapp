package com.liakhovskyi.service;

import com.liakhovskyi.model.Role;
import com.liakhovskyi.model.User;

import java.util.List;

public interface UserService {

    User getByUsername(String username);

    User register(User user);

    List<Role> getAllRoles();

    List<User> getAllUsers();
}

package com.liakhovskyi.service;

import com.liakhovskyi.dao.RolesDao;
import com.liakhovskyi.dao.UserDao;
import com.liakhovskyi.model.Role;
import com.liakhovskyi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RolesDao rolesDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public User getByUsername(String username) {
        return userDao.getByUsername(username);
    }

    @Override
    public User register(User user) {
        String hashedPassword = encoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        user.setToken(getToken());
        return userDao.save(user);
    }

    @Override
    public List<Role> getAllRoles() {
        return rolesDao.findAll();
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    private String getToken() {
         return UUID.randomUUID().toString();
    }
}

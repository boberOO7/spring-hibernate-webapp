package com.liakhovskyi.dao;

import com.liakhovskyi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User getByUsername(String username);

}

package com.liakhovskyi.dao;

import com.liakhovskyi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesDao extends JpaRepository<Role, Long> {

}

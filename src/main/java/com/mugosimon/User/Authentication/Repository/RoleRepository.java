package com.mugosimon.User.Authentication.Repository;

import com.mugosimon.User.Authentication.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository
        extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
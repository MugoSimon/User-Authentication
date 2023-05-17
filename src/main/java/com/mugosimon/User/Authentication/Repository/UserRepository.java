package com.mugosimon.User.Authentication.Repository;

import com.mugosimon.User.Authentication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
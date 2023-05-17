package com.mugosimon.User.Authentication.Service;

import com.mugosimon.User.Authentication.Dto.UserDto;
import com.mugosimon.User.Authentication.Entity.User;

import java.util.List;

public interface UserService {

    //saving users with all attributes
    void saveUser(UserDto userDto);

    //finding registered user by email
    User findUserByEmail(String email);

    //as stated.
    List<Object> findAllUsers();
}
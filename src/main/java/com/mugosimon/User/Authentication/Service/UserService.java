package com.mugosimon.User.Authentication.Service;

import com.mugosimon.User.Authentication.Dto.UserDto;
import com.mugosimon.User.Authentication.Entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
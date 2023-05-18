package com.mugosimon.User.Authentication.Service;

import com.mugosimon.User.Authentication.Dto.UserDto;
import com.mugosimon.User.Authentication.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {


    //saving users with all attributes
    void saveUser(UserDto userDto);

    //finding registered user by email
    User findUserByEmail(String email);

    //as stated.
    List<Object> findAllUsers();
}
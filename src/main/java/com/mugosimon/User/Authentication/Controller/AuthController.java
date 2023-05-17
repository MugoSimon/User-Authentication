package com.mugosimon.User.Authentication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    //the handle that handles home page request and such
    @GetMapping("/index")
    public String home() {
        return "home";
    }

}

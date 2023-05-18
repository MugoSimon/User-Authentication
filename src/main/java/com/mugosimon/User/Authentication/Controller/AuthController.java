package com.mugosimon.User.Authentication.Controller;

import com.mugosimon.User.Authentication.Dto.UserDto;
import com.mugosimon.User.Authentication.Entity.User;
import com.mugosimon.User.Authentication.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class AuthController {
    private UserService userService;

    //the handle that handles home page request and such
    @GetMapping("/index")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        // create model object to store form data
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }

    // handler method to handle user registration form submit request
    /*@PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto userDto,
                               BindingResult result,
                               Model model) {
        User existingUser = userService.findUserByEmail(userDto.getEmail());

        if (existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()) {
            if (result.hasErrors()) {
                model.addAttribute("user", userDto);
                return "/register";
            }

        }else {
            result.rejectValue("email", null,
                    "There is already an account registered with the same email");
        }
        userService.saveUser(userDto);
        return "redirect:/register?success";
    }*/

    public ResponseEntity<String> registerUser(@RequestBody UserDto userDTO) {
        // Validate userDTO or perform any necessary input validation

        // Create a new User object from the userDTO
        User newUser = new User();
        newUser.setEmail(userDTO.getEmail());
        newUser.setName(userDTO.getFirstName()+ " "+ userDTO.getLastName());
        // Set other properties as needed

        // Save the user using the userService
        userService.saveUser(userDTO);

        return ResponseEntity.ok("User registered successfully");
    }

    // handler method to handle list of users
    @GetMapping("/users")
    public String users(Model model) {
        List<Object> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    // handler method to handle login request
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}

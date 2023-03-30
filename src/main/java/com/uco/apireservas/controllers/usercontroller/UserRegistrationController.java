package com.uco.apireservas.controllers.usercontroller;

import com.uco.apireservas.domain.user.User;
import com.uco.apireservas.services.user.UserService;
import com.uco.apireservas.controllers.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    @Autowired
    private UserService userService;


    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("User") UserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return "redirect:/registration?success";
    }

    @PostMapping
    public void registerUser(@RequestBody UserRegistrationDto registrationDto){
        userService.save(registrationDto);

    }
}

package com.example.spring_boot_jwt_ntn.controller;

import com.example.spring_boot_jwt_ntn.entity.User;
import com.example.spring_boot_jwt_ntn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public String saveUserRegister(@RequestBody User user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        if(userService.saveAndFlush(user)){
            return "Register Successful!";
        }
        return "Register Fail!";
    }
    @GetMapping("/getuser")
    public User getUser(@RequestBody User user){
        return userService.getUser(user.getUsername());

    }

}

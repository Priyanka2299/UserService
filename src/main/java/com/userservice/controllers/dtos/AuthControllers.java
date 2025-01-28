package com.userservice.controllers;

import com.userservice.controllers.dtos.SignUpRequestDto;
import com.userservice.controllers.dtos.SignUpResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthControllers {
    @PostMapping("/sign up")
    public SignUpResponseDto signUp(SignUpRequestDto request) {
        return null;
    }
    @PostMapping("/login")
    public String login(){

    }
}

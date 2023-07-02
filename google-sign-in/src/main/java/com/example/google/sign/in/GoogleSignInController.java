package com.example.google.sign.in;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleSignInController {
    @GetMapping("/login")
    public String login(@AuthenticationPrincipal OAuth2User principal) {
        return "/";
    }

    @GetMapping
    public String home(){
        return "Welcome to google!";
    }
}

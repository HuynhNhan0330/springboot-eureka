package com.example.LoginService;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableDiscoveryClient
public class LoginGoogle {
    @GetMapping("/login")
    public String login(@AuthenticationPrincipal OAuth2User principal) {
        return "redirect:/";
    }
}

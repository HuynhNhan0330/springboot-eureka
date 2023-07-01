package com.example.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;

public interface homeController {
    @RequestMapping("/home")
    String getHome();
}

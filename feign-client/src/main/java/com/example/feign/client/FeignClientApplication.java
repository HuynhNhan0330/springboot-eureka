package com.example.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
@Controller
public class FeignClientApplication {

	@Autowired
	private HomeClient homeClient;

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}

	@RequestMapping("/home")
	public String greeting(Model model) {
		model.addAttribute("nameHome", homeClient.getHome());
		return "home";
	}
}


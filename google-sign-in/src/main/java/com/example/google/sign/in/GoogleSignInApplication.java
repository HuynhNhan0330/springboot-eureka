package com.example.google.sign.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class GoogleSignInApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleSignInApplication.class, args);
	}

}

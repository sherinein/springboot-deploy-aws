package com.cloud.oauth;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringCloudOauth2Application {
	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi"+principal.getName()+"welcome to SpringCloudOauth2Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2Application.class, args);
	}

}

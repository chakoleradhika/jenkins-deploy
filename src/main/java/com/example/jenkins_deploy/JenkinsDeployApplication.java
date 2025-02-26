package com.example.jenkins_deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDeployApplication.class, args);
	}

	@GetMapping("/greet")
	public String greet(){
		return "hello how are you";
	}
}

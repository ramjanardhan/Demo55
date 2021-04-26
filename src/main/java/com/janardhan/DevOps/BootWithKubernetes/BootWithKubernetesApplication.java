package com.janardhan.DevOps.BootWithKubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootWithKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootWithKubernetesApplication.class, args);
	}
	
	@RequestMapping("/")
	public String message() 
	{
		return "Hello Boot Welcome To Kubernetes Integrated By Jenkins && Git-Hub";
	}

}

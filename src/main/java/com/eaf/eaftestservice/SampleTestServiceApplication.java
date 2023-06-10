package com.eaf.eaftestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan("com.eaf")
public class SampleTestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleTestServiceApplication.class, args);
	}

	@GetMapping("/")
	public String helloWorld(){
		return  "Hello World!!";
	}
}

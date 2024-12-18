package com.example.my_crud_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MyCrudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCrudProjectApplication.class, args);
	}

}
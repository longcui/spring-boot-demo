package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//// no need for below line: Spring Boot automatically scans all the classes in the same package or sub packages of Main-class for components.
////@ComponentScan(basePackages = {"com.example.demo"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

//not working
//public class DemoApplication extends SpringBootServletInitializer {
//
//}


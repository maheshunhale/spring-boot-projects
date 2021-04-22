package com.springboot.basics.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootStarterApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootStarterApplication.class, args);
		System.out.println(">>>Application started...");
		
		  for(String str : applicationContext.getBeanDefinitionNames()) {
		  System.out.println(">>> "+str); }
		 
	}

}

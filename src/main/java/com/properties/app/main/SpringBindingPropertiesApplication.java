package com.properties.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.properties.app.main.properties.MyAppProperties;


@SpringBootApplication
public class SpringBindingPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBindingPropertiesApplication.class, args);
	}
	
}


package com.ecome.demoecome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ecome.demoecome"})
public class DemoecomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoecomeApplication.class, args);
	}

}

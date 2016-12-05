package com.airdit.spbt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EnableAutoConfiguration
public class MySpringBoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My First Spring Boot Application1");
		SpringApplication.run(MySpringBoot.class, args);
	}

}

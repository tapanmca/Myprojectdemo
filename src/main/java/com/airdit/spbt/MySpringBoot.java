package com.airdit.spbt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.airdit.rest")
@EnableAutoConfiguration
public class MySpringBoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is my second comit
		//This wiil shown only after 1 commit
		System.out.println("My First Spring Boot Application1 using repository");
		SpringApplication.run(MySpringBoot.class, args);
	//This is the third comit
		//Difference is color of the comit
	
				
	}

}

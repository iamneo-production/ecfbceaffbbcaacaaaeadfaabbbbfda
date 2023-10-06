package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 

@SpringBootApplication
public class SpringappApplication {

 

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringappApplication.class, args);
        Team team = (Team) context.getBean("team");
        System.out.println("Team : "+team);
    }

 

}

	 

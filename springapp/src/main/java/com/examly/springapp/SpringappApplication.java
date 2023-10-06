package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.examly.springapp.model.Team;
import org.springframework.context.*;
 

@SpringBootApplication
public class SpringappApplication {

 

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringappApplication.class, args);
        Team team = (Team) context.getBean("team");
        team.setTeamId(1001);
        team.setTeamName("Anil");
        System.out.println("Team : "+team);
    }

 

}

	 

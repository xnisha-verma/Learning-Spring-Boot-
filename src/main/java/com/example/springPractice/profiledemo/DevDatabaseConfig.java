package com.example.springPractice.profiledemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDatabaseConfig  implements  DatabaseConfig{
     public void setup(){
        System.out.println("setting up dev database: Mysql");
    }
}

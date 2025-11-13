package com.example.springPractice.profiledemo;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDatabaseConfig implements DatabaseConfig{
    @Override
    public void setup() {
        System.out.println("setting up Prod database: postgresql(cloud)");
    }
}

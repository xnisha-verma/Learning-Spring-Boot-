package com.example.springPractice.GreetService;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class Devservice {
    public String getmessage(){return "dev";}
}

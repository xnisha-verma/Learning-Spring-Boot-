package com.example.springPractice.GreetService;

import org.springframework.stereotype.Service;

@Service
public class Greet {
    public String greeting(){
        return "hello";
    }
}

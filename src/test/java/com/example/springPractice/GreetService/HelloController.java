package com.example.springPractice.GreetService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hellow")
    public String hello(){
        return "Hello api";
    }
}

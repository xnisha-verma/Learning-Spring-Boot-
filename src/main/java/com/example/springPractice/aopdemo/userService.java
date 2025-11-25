package com.example.springPractice.aopdemo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class userService {
    public void register(){
        System.out.println("user registered");
    }
    public void login(){
        System.out.println("user logged in");
//        throw new RuntimeException("error login");
    }
    public String getuser(){
        System.out.println("getting user");
        return "nisha";
    }

}

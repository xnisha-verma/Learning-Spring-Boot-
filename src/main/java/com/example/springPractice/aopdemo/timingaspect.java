package com.example.springPractice.aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class timingaspect {
    @After("execution(* *.login(..))")
    public void timing(){
        System.out.println("started timing");
    }
}

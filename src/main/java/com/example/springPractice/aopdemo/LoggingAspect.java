package com.example.springPractice.aopdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {
//    @Before("execution(* com.example.springPractice.aopdemo.*.*(..))")
//    @Before("execution(* *.login(..))")
//    public void log(){
//        System.out.println("logging before method");
//    }
    @Before("execution(* *.getuser(..))")
    public void loggetter(){
        System.out.println("getter method called");
    }

}
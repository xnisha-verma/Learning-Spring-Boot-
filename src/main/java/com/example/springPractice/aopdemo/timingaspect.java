package com.example.springPractice.aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class timingaspect {
//    @After("execution(* *.login(..))")
//    public void timing(){
//        System.out.println("started timing");
//    }
    @Pointcut("execution(* *.login(..))")
    public void all(){}

    @Before("all()")
    public void time(){
        System.out.println("after time method");
    }


}

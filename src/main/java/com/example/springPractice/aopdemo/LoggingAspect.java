package com.example.springPractice.aopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {
//    @Before("execution(* com.example.springPractice.aopdemo.*.*(..))")
//    @AfterThrowing("execution(* *.login(..))")
//    public void log(){
//        System.out.println("logging before method");
//    }
//    @Before("execution(* *.getuser(..))")
//    public void loggetter(){
//        System.out.println("getter method called");
//    }
//    @Around("execution(* com.example.springPractice.aopdemo.*.*(..))")
//    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
//        System.out.println("before method: "+pjp.getSignature().getName());
//        long start = System.currentTimeMillis();
//        Object result = pjp.proceed();
//        long end = System.currentTimeMillis();
//        System.out.println("after method: "+pjp.getSignature().getName());
//        System.out.println("execution time: "+(end-start)+"ms");
//        return "modified";
//    }

    @Pointcut("execution(* com.example.springPractice.aopdemo.*.*(..))")
    public void allAopmethods(){}

    @Before("allAopmethods()")
    public void beforelog(){
        System.out.println("before method");
    }
    @After("allAopmethods()")
    public void afterlog(){
        System.out.println("after method");
    }

}
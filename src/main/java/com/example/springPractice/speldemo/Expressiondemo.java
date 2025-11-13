package com.example.springPractice.speldemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Expressiondemo {
    @Value("#{5+3}")
    private int sum;

    @Value("#{5>3}")
    private boolean greater;

    @Value("#{'SPRING'+'BOOT'}")
    private String fullname;

    @Value("#{T(java.lang.Math).sqrt(81)}")
    private double root;

    @Value("#{userInfo.age+5}")
    private int age;

    public void displayvalues(){
        System.out.println("sum: "+sum);
        System.out.println("is 5>3: "+greater);
        System.out.println("full name: "+fullname);
        System.out.println("square root: "+root);
        System.out.println("future age: "+age);
    }

}

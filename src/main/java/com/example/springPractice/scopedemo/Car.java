//package com.example.springPractice.scopedemo;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Component
//@Scope("prototype")
//public class Car {
//    @Autowired
//    private Engine engine;
//    public Car(){
//        System.out.println("car bean created");
//    }
//    public  void drive(){
//        System.out.println("car is in drive mode"+engine.hashCode());
//    }
//
//}

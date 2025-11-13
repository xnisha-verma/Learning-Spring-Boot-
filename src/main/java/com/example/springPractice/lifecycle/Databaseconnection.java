//package com.example.springPractice.lifecycle;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Databaseconnection {
//
////    @PostConstruct
////    public void connect() {
////        System.out.println("✅ Database connected successfully!");
////    }
////
////    @PreDestroy
////    public void disconnect() {
////        System.out.println("❌ Database connection closed.");
////    }
//
//    @PostConstruct
//    public void connect() throws InterruptedException{
//        System.out.println("connecting to DB");
//        Thread.sleep(2000);
//        System.out.println("DB is connected");
//    }
//}

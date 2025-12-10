//package com.MVCLearning.demo.student;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.awt.*;
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository){
//        return args->{
//            Student nisha =  new Student(
//                          "nisha",
//                            "nisha@gmail.com",
//                            LocalDate.of(2005, Month.JULY,17)
//
//            );
//            Student rajat = new Student(
//                    "rajat",
//                    "rajat@gmail.com",
//                    LocalDate.of(2004, Month.SEPTEMBER,9)
//
//            );
//            repository.saveAll(
//                    List.of(nisha,rajat)
//            );
//        };
//    }
//}

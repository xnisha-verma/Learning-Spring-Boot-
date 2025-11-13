package com.example.springPractice;


import com.example.springPractice.lifecyclephase.BeanB;
//import com.example.springPractice.scopedemo.Car;
//import com.example.springPractice.lifecycle.Applifeclye;
import com.example.springPractice.OrderLab.OrderController;
import com.example.springPractice.profiledemo.DatabaseConfig;
import com.example.springPractice.scanLab.beta;
import com.example.springPractice.scanLab.gamma;
import com.example.springPractice.scandemo.Tata;
import com.example.springPractice.scandemo.Tataengine;
import com.example.springPractice.speldemo.Expressiondemo;
import com.example.springPractice.stereotype.Payment;
import com.example.springPractice.stereotype.UserController;
import com.example.springPractice.valuedemo.AppInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(
		basePackages="com.example.springPractice.scanLab",
		excludeFilters = @ComponentScan.Filter(
				type = FilterType.ASSIGNABLE_TYPE,
				classes = com.example.springPractice.scanLab.gamma.class
		)

)
public class SpringPracticeApplication {
	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class, args);
//		Car car = context.getBean(Car.class);
//		car.drive();

//		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
//
//		Car car = context.getBean(Car.class);
//		car.drive();

//		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class, args);
//
//		// Getting two Car beans
//		Car car1 = context.getBean(Car.class);
//		Car car2 = context.getBean(Car.class);
//
//		System.out.println("Car 1: " + car1.hashCode());
//		System.out.println("Car 2: " + car2.hashCode());
//		System.out.println("Are both cars same? " + (car1 == car2));
//
//		car1.drive();
//		car2.drive();

//		ApplicationContext context  = SpringApplication.run(SpringPracticeApplication.class);
//		AppInfo app = context.getBean(AppInfo.class);
//		app.displayInfo();

//		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class);
//		DatabaseConfig databaseConfig = context.getBean(DatabaseConfig.class);
//		databaseConfig.setup();

//		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class);
//		Expressiondemo expressiondemo = context.getBean(Expressiondemo.class);
//		expressiondemo.displayvalues();

//		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class);
//		Tata tata = context.getBean(Tata.class);
//		Tataengine tataengine = context.getBean(Tataengine.class);
//		tataengine.iginite();
//		tata.start();


		//shutdown and startup
//		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class);
//		Applifeclye applifeclye = context.getBean(Applifeclye.class);
//		System.out.println("app running");

		//Stereo annotations
//		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class);
//		Payment payment = context.getBean(Payment.class);
//		payment.processPayment();

//		UserController  userController = context.getBean(UserController.class);
//		userController.register();

    	// Order Lab

//		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class);
//		OrderController orderController  = context.getBean(OrderController.class);
//		orderController.order();

		// Scan Lab
//		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class);
//		beta beta = context.getBean(beta.class);
//		beta.hello();
//		gamma gamma = context.getBean(com.example.springPractice.scanLab.gamma.class);
//		gamma.hi();

		//lifecyclephase
		ApplicationContext context = SpringApplication.run(SpringPracticeApplication.class, args);
		BeanB b = context.getBean(BeanB.class);
		System.out.println("App running");
	}

}


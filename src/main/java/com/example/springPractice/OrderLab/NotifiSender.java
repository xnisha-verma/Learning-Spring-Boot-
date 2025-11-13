package com.example.springPractice.OrderLab;

import org.springframework.stereotype.Component;

@Component
public class NotifiSender {
    public void message(){
        System.out.println("Notification send to customer (SMS/mail)");
    }
}

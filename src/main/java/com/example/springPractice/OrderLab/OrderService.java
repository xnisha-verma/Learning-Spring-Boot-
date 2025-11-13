package com.example.springPractice.OrderLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private Orderrepo orderrepo;
    @Autowired
    private NotifiSender notifiSender;

    public void request(){
        System.out.println("⚙\uFE0F Processing order...");
        orderrepo.savedData();
        notifiSender.message();
    }
}

package com.example.springPractice.OrderLab;

import org.springframework.stereotype.Service;

@Service
public class PayementGateway {
    public void payment(){
        System.out.println("\uD83D\uDCB3 Payment completed successfully.");
    }
}

package com.example.springPractice.OrderLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Orderrepo {
    @Autowired
    private PayementGateway payementGateway;

    public void savedData(){
        System.out.println(" \uD83D\uDCBE order saved into database!!!");
        payementGateway.payment();
    }
}

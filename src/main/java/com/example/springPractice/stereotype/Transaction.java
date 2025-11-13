package com.example.springPractice.stereotype;

import org.springframework.stereotype.Repository;

@Repository
public class Transaction {
    public void saveTransaction(){
        System.out.println("transaction is saved");
    }
}

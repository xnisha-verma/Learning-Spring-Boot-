package com.example.springPractice.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculator {
    @Test
    public void testadd(){
        int result = 5+5;
        assertEquals(10,result);
    }
}
package com.example.springPractice.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testMath {
    @Test
    public void testmultiply(){
        Mathutils mt = new Mathutils();
        int result = mt.multiply(5,3);
        assertEquals(15,result);
    }
}

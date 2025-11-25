package com.example.springPractice.GreetService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class greetTest {
    @Autowired
    private Greet greet;
    @Test
    public void testgreet(){
        String msg = "hello";
        assertEquals("hello", msg);
    }
}

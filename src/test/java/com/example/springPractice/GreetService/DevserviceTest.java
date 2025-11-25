package com.example.springPractice.GreetService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("dev")
public class DevserviceTest {
    @Autowired
    Devservice devservice;

    @Test
    public void TestProfile(){
        assertEquals("dev",devservice.getmessage());
    }
}

package com.example.springPractice.OrderLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    public void order() {
        System.out.println("Request is received: Place Order");
        orderService.request();
    }
}

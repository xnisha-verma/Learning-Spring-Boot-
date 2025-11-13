package com.example.springPractice.valuedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInfo {
    @Value("${app.name}")
    private String appName;

    @Value("${app.owner}")
    private String appOwner;

    @Value("${app.message}")
    private String appMessage;

    public void displayInfo(){
        System.out.println("app info");
        System.out.println("name: "+appName);
        System.out.println("owner: "+appOwner);
        System.out.println(("message: "+appMessage));
    }
}

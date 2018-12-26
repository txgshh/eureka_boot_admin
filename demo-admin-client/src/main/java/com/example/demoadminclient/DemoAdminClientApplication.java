package com.example.demoadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAdminClientApplication.class, args);
    }

   @RequestMapping("/")
    public String getIndex(){
        return "123456";
    }
}


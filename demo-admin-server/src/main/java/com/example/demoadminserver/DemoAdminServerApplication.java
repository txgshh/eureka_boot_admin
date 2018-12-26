package com.example.demoadminserver;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class DemoAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAdminServerApplication.class, args);
    }

}


package com.example.salesmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class SalesManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalesManagementApplication.class, args);
    }

}

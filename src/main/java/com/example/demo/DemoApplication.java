package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("Welcome Yogita 3176076");
        SpringApplication.run(DemoApplication.class, args);
    }
}

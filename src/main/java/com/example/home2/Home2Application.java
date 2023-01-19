package com.example.testingpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestingproApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingproApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "welcome home";
    }

    @GetMapping("/dash")
    public String dash() {
        return "welcome dash";
    }
}

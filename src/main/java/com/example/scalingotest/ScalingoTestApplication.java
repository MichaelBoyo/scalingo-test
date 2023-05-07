package com.example.scalingotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ScalingoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalingoTestApplication.class, args);
    }
    @CrossOrigin("*")
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}

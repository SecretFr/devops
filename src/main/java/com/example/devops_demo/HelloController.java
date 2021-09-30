package com.example.devops_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        System.out.println("test");
        Calc calc = new Calc();
        long result = calc.add(10, 20);
        
        return "Welcome to Simple Ecommerce ver 4.5 (10 + 20 = " + result +")";
    }
}

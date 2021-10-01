package com.example.devops_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

//    @GetMapping("/")
//    public String hello(){
//        System.out.println("test");
//        Calc calc = new Calc();
//        long result = calc.add(10, 20);
//
//        return "Welcome to Simple Ecommerce ver 4.5 (10 + 20 = " + result +")";
//    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final String version = "2.0";

    @GetMapping("/")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name), version);
    }
}

package com.cts.springbootCIDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello from CI Demo";
    }

    @GetMapping("/newHello")
    public String newEndpoint(){
        return "Added new endpoint in github";
    }
}

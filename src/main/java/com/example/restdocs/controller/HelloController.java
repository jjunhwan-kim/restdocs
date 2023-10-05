package com.example.restdocs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "ok";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

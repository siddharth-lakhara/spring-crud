package com.spring.mvc.springcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/")
    public String hello() {
        return "Server working";
    }

    @GetMapping("/ping")
    public String ping() {
        return "Pong";
    }
}

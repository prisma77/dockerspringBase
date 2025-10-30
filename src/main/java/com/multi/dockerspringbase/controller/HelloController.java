package com.multi.dockerspringbase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return " Docker + Spring Boot 완벽하게 동작 중입니다! ";
    }
}


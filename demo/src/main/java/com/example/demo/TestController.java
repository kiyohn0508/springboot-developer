package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String home() {
        return "index"; // src/main/resources/templates/index.html 파일 필요
    }
}
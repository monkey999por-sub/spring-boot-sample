package com.example.monkey.demo.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/app")
    public String index() {
        return "app controller run with spring boot";
    }
}

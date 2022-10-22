package com.example.monkey.demo.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class RestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/rest")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println(name);
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/rest-post")
    public PostBean postBean (){
        return new PostBean();
    }
}
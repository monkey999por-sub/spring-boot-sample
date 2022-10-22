package com.example.monkey.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class IndexController {

    @GetMapping("/")
    public String index(){
        var body = """
        <h2>welcome to spring boot sample</h2><br>
        <a href="/app">app hear</a><br><br>
        <a href="/rest">rest hear(get)</a><br><br>
        """;
        return body;
    }
}

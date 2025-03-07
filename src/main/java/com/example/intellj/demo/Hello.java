package com.example.intellj.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/na")
    public String run(){

        return "hellooo";
    }
}

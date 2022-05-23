package com.example.demo.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class WebController {
    @GetMapping("/home")
    public String home(ModelMap model) {
        return "home";
    }

    @GetMapping("/hello")
    public String hello(ModelMap model) {
        return "hello";
    }
}

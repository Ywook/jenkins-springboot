package com.example.jenkinsspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @RequestMapping("/")
    public String hello() {
        return "Hi";
    }

    @RequestMapping("/webhook")
    public String webhook() {
        return "Webhook Test";
    }
}
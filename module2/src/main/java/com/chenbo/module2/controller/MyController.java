package com.chenbo.module2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module2")
public class MyController {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "success";
    }
}

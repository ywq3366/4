package com.example.demo.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class a {
    @GetMapping
    public String a(){
        System.out.println("部署练习");
        return "1234";
    }
}

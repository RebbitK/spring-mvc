package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello world";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "Get Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "Put Method 요청";
    }

    @DeleteMapping("/api/delete")
    @ResponseBody
    public String delete(){
        return "Delete Method 요청";
    }
}

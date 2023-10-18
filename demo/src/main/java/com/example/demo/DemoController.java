package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String helloWorld(){ return "Hello this is mall"; }

    @GetMapping("/home")
    public String home(){ return "this is home"; }

    @GetMapping("/user")
    public UserInfo getUser() {return new UserInfo("123", "John");}

}

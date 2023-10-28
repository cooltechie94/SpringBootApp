package com.springboottan.mybootapp.RestControllerClass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

    @GetMapping("/")
    public String getHello(){
        return "Hello World";
    }
    @GetMapping("/users")
    public String getUsers(){
        return "Loading...";
    }
}

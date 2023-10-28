package com.springboottan.mybootapp.RestControllerClass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

    @GetMapping("/")
    public String getHello(){
        return "Hello MFs";
    }
    @GetMapping("/users")
    public String getUsers(){
        return "Ideally it should read from a DB and return users. But hey, we need to learn that";
    }
}

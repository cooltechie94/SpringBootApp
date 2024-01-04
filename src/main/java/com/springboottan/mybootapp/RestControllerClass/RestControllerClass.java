package com.springboottan.mybootapp.RestControllerClass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

    @Value("${team.name}")
    private String teamName;

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String getHello(){
        return "Hello World";
    }
    @GetMapping("/users")
    public String getUsers(){
        return "Loading...";
    }
    @GetMapping("/teaminfo")
    public String displayTeam(){
        return "We are "+ teamName + " Football Club. Founded in 1892.  \n" +
                "The club has won 19 league titles, eight FA Cups & a record nine League Cups." +
                "Current Coach Name: "+ coachName ;
    }
}

package com.example.exerciseintroductiontospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping("/name")
    public String name(){
        return "My name is Hadeel";
    }
    @GetMapping("/age")
    public String age(){
        return "My age is 24";
    }
    @GetMapping("/check/status")
    public String checkStatus(){
        return "Everything OK";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }
@GetMapping("/names")
    public String[] names(){
        return new String[]{"Hadeel", "Boshra", "Alaa"};
    }

}

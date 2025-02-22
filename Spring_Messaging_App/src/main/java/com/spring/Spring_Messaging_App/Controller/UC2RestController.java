package com.spring.Spring_Messaging_App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC2RestController{

    @GetMapping("/hello/query")
    public String sayHello(@RequestParam String name) {
        return "Hello, " + name + " from BridgeLabz";
    }
}

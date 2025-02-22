package com.spring.Spring_Messaging_App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC3RestController{

    @GetMapping("/hello/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + " from BridgeLabz";
    }
}

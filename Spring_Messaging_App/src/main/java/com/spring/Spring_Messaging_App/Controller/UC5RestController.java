package com.spring.Spring_Messaging_App.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class UC5RestController {

    @PutMapping("/put/{firstName}")
    public  String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}


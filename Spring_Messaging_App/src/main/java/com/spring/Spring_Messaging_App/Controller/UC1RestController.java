package com.spring.Spring_Messaging_App.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC1RestController{
    @RequestMapping("/")
    public String index(){
        return  "Hello from BridgeLabz";
    }
}
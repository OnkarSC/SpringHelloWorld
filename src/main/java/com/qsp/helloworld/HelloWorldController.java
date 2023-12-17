package com.qsp.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    String string = "Hi Onkar Choudhari....";
    @GetMapping("/hello")
    public String webStarter(){
       return string;
    }
}

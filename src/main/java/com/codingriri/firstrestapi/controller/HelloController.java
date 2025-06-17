package com.codingriri.firstrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //class is now a Controller
public class HelloController {
    //Q. how will Spring know when to call the below method? - tada: we use annotations
    
    @GetMapping("/") //annotation - root path
    public String printHello(){ //method
        return "Hello World"; //returns string type
    }
}

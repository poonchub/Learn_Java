package com.sut.lab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Lab01Controller {
    
    @GetMapping("/input")
    public String readInput(){
        return "test lab";
    }
}

package com.example.microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class RestService {

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

}

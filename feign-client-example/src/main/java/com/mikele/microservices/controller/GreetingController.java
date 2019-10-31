package com.mikele.microservices.controller;

import com.mikele.microservices.feignclients.ExampleGreetingFeignController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private ExampleGreetingFeignController greetingClient;

    @GetMapping("/get-greeting")
    public String greeting() {
        return "FEIGN_CLIENT ->" + greetingClient.greeting();
    }

}

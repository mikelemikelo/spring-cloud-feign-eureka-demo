package com.mikele.microservices.controllers;

import com.mikele.microservices.feignclients.ExampleGreetingFeignController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements ExampleGreetingFeignController {

    @Override
    public String greeting() {
        return "Method being called from a different Microservice using Feign";
    }

}

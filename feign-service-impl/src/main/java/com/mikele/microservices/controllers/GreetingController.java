package com.mikele.microservices.controllers;

import com.mikele.microservices.feignclients.ExampleGreetingFeignController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements ExampleGreetingFeignController {

    @Override
    public String greeting() {
        return " Hi!! I'm the Microservice inside FEIGN-SERVICE-IMPL  , that's cool, isn't it?";
    }

}

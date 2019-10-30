package com.mikele.microservices.controllers;

import com.mikele.microservices.feignclient.ExampleGreetingClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements ExampleGreetingClient {

    @Override
    public String greeting() {
        return "Method being called from a different Microservice using Feign";
    }
}

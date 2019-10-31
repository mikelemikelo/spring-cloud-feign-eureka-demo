package com.mikele.microservices.controller;

import com.mikele.microservices.feignclients.ExampleGreetingFeignController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private ExampleGreetingFeignController greetingFeignClient;


    @GetMapping("/get-greeting")
    public String greeting() {
        return "FIRST REST ENDPOINT FROM: spring-cloud-eureka-feign-client "
                + "    Calling inside a different REST Endpoint located at a different Microservice, and this is the response ->  {  \n "
                + greetingFeignClient.greeting()   + " } ";
    }

}

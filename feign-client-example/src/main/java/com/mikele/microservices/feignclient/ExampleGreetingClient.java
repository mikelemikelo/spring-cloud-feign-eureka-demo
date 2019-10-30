package com.mikele.microservices.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
public interface ExampleGreetingClient {


    @RequestMapping("/greeting")
    String greeting();


}

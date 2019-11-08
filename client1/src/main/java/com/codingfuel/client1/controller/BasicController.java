package com.codingfuel.client1.controller;

import com.codingfuel.client1.feign.ClientFeign;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    private ClientFeign clientFeign;

    @Autowired
    public BasicController(ClientFeign clientFeign){
        this.clientFeign = clientFeign;
    }

    @HystrixCommand
    @GetMapping("/obtineDate")
    ResponseEntity<String> getResponse(){
        return clientFeign.getResponseEntity();
    }

}

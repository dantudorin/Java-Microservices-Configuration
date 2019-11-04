package com.codingfuel.client1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("client2")
public interface ClientFeign {

    @GetMapping("/obtine")
    ResponseEntity<String> getResponseEntity();


}

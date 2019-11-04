package com.codingfuel.client2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/obtine")
    ResponseEntity<String>  getResponse(){
        return new ResponseEntity<>("asdadada", HttpStatus.OK);
    }

}

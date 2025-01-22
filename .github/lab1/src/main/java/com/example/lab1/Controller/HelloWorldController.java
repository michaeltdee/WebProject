package com.example.lab1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@RestController
//public class HelloWorldController {
//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello, World!";
//    }
//}


@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, World!");
        return response;
    }
}

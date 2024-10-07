package com.eDigest.myFirstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("api")
    public String sayHello() {
        return "Hello World";
    }
}

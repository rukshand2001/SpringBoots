package com.rukshand.sample.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi ...hello!!!....";
    }
}

package com.jwt.mycontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping(path = "/hello")
    public String gre()
    {
        return "hello bhim";
    }
    @GetMapping(path = "/hello-world")
    public Helloworld helloworld(){
        return new Helloworld("hi im here world");
    }
}

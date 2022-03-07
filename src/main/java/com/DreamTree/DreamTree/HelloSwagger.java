package com.DreamTree.DreamTree;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSwagger {

    @GetMapping("/hello")
    public String hello(){
        return "hi there";
    }

    @PostMapping("/hello")
    public String hello(@RequestBody Hello hello){
        return hello.getHello() + hello.getName();
    }

}

package com.java.hello.world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class helloworld {

    @RequestMapping("/")

    public String index() {

        return "Hello World";
    }
}

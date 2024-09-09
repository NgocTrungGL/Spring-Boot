package com.example.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/")
    public String Hello()
    {
        return "hello";
    }
    @GetMapping("/contract")
    public String Contract()
    {
        return "Contract me with Zalo";
    }
}

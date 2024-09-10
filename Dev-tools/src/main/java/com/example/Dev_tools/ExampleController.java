package com.example.Dev_tools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/")
    public String index()
    {
        return "hello";
    }
    @GetMapping("/h2")
    public String index2()
    {
        return "he he he";
    }
}

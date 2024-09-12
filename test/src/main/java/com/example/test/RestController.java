package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/helo")
    public String index()
    {
        return "Chao cac ban den voi Channel cua minh";
    }
}

package com.example.test;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageInterface{

    @Override
    public String message() {
        return "Email sending....... 1234";
    }
}

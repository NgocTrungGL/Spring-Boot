package com.example.test.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService{
    public SmsService()
    {
        System.out.println("Contructor cua lop "+ getClass().getName());
    }
    @Override
    public String message() {
        return "Sms Sending......";
    }
}

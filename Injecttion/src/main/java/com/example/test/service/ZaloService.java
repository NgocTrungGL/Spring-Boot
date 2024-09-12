package com.example.test.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ZaloService implements MessageService{

    public ZaloService()
    {
        System.out.println("Contructor cua lop "+ getClass().getName());
    }
    @Override
    public String message() {
        return "Zalo Sending ....";
    }
}

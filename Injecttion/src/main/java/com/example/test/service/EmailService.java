package com.example.test.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmailService implements MessageService {
    public EmailService()
    {
        System.out.println("Contructor cua lop "+ getClass().getName());
    }
    @Override
    public String message() {
        return "Email sending.......";
    }
}

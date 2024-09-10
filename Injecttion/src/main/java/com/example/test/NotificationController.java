package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private MessageInterface email;

//    @Autowired
//    public NotificationController(EmailService email)
//    {
//        this.email = email;
//    }
    @Autowired
    public void setEmail(EmailService email)
    {
        this.email = email;
    }
    @GetMapping("/notification")
    public String noti()
    {
        return this.email.message();
    }
}

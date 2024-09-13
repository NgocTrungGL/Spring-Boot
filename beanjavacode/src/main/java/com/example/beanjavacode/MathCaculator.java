package com.example.beanjavacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MathCaculator {

    @Bean
    public Caculator getCaculator()
    {
        return new Caculator();
    }
}

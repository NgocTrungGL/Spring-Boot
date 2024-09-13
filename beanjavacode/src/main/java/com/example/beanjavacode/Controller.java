package com.example.beanjavacode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Caculator mycaculator;
    @Autowired
    public Controller(@Qualifier("getCaculator")Caculator mycaculator)
    {
        this.mycaculator = mycaculator;
    }
    @GetMapping("/sqrt")
    public String index(@RequestParam("Value") double x)
    {
        return "SQRT = "+ this.mycaculator.Sqrt(x);

    }
    @GetMapping("/pow")
    public String index2(@RequestParam("Value") double x)
    {
        return "SQRT = "+ this.mycaculator.Pow(x);
    }
}

package com.Quess.Microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class numbercontroller
{
    @Autowired
    private numberconfiguration numberconfiguration;
    @GetMapping("/Max&Min_numbers")
    public numberconfiguration number()
    {
        return new numberconfiguration(numberconfiguration.getMax_num(),numberconfiguration.getMin_num());

    }
}

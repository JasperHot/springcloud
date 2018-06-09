package com.example.servicefeign.Controller;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry feign "+name;
    }
}

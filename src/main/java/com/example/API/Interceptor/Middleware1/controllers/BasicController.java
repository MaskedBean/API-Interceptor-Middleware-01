package com.example.API.Interceptor.Middleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("")
    public Date getCurrentDateTime(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd" + " HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        return date;
    }
}

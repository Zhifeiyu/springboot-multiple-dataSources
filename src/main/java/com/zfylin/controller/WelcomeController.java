package com.zfylin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public Map<String, java.io.Serializable> welcome() {
        Map<String, java.io.Serializable> model = new HashMap<>();
        model.put("time", new Date());
        model.put("message", "Hello World");
        return model;
    }

}
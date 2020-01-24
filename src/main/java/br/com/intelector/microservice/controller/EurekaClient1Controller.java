package br.com.intelector.microservice.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/microservice/eurekaClient1")
public class EurekaClient1Controller {

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping
    public String get(){
        return "get eurekaClient 1";
    }

    @PostMapping
    public String post(){
        return "post eurekaClient 1";
    }


}

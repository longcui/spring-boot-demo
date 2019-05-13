package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

@Service
public class ServiceExample {

    public ServiceExample() {
        System.out.println("haha");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroyed");
    }
}

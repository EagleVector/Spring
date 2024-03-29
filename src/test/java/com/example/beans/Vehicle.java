package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle has been created");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @PreDestroy
//    public void destroy() {
//        System.out.println("Destroying Vehicle Bean");
//    }
//
//    @PostConstruct
//    public void initialize() {
//        this.name = "Honda";
//    }

    public void printHello() {
        System.out.println("Printing Hello From Vehicle Bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is: " + name;
    }
}

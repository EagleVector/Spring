package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Lucy";

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person has been created By Spring");
        this.vehicle = vehicle;
    }

    // @Autowired
    private Vehicle vehicle;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    // Autowired can be applied on top of a class field, setter method or a constructor(can be applied on final key better security)
//    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

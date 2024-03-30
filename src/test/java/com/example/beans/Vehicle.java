package com.example.beans;

import com.example.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//public class Vehicle {
//
//    public Vehicle() {
//        System.out.println("Vehicle has been created");
//    }
//    private String name = "Toyota";

    // Circular dependency with auto wiring.

//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
//
//    @Autowired
//    private Person person;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @PreDestroy
//    public void destroy() {
//        System.out.println("Destroying Vehicle Bean");
//    }
//
//    @PostConstruct
//    public void initialize() {
//        this.name = "Honda";
//    }

//    public void printHello() {
//        System.out.println("Printing Hello From Vehicle Bean");
//    }
//
//    @Override
//    public String toString() {
//        return "Vehicle name is: " + name;
//    }
//}
@Component(value = "vehicleBean")
public class Vehicle {

    private String name = "Honda";

    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
//        System.out.println("Vehicle Bean Created by Spring");
        this.vehicleServices = vehicleServices;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    @Override
    public String toString() {
        return "Vehicle name is: " + name;
    }

}
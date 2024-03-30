package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Ex1 {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Mercedes Benz");
//        System.out.println("Vehicle Name: " + vehicle.getName());

//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Person person = context.getBean(Person.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);
//
//        System.out.println("Person Name from Spring Context: " + person.getName());
//        System.out.println("Vehicle name from Spring Context: " + vehicle.getName());
//        System.out.println("Vehicle that person owns: " + person.getVehicle());

        // NoUniqueBeanDefinitionException: Multiple Beans with same data type
        // Handle bean with name param

//        Vehicle veh = context.getBean(Vehicle.class);
//        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
//        veh.printHello();
//        context.close();

//        String hello = context.getBean(String.class);
//        System.out.println("String Value from Context is: " + hello);
//
//        Integer num = context.getBean(Integer.class);
//        System.out.println("Integer value from Context is: " + num);

//        Vehicle volkswagen = new Vehicle();
//        volkswagen.setName("VolksWagen");
//        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;
//
//        Supplier<Vehicle> audiSupplier = () -> {
//            Vehicle audi = new Vehicle();
//            audi.setName("Audi");
//            return audi;
//        };
//
//        Random random = new Random();
//        int randomNumber = random.nextInt(10);
//        System.out.println("Random Number: " + randomNumber);
//
//        if (randomNumber % 2 == 0) {
//            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
//        }
//
//        else {
//            context.registerBean("audi", Vehicle.class, audiSupplier);
//        }
//
//        Vehicle volksVehicle = null;
//        Vehicle audiVehicle = null;

//        try {
//            volksVehicle = context.getBean("volkswagen", Vehicle.class);
//        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
//            System.out.println("Error while creating Volkswagen vehicle");
//        }
//
//        try {
//            audiVehicle = context.getBean("audi", Vehicle.class);
//        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
//            System.out.println("Error while creating Audi vehicle");
//        }
//
//        if (null != volksVehicle) {
//            System.out.println("Programming Vehicle Name for Spring Context is: " + volksVehicle.getName());
//        } else {
//            System.out.println("Programming Vehicle Name for Spring Context is: " + audiVehicle.getName());
//        }

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        String[] persons = context.getBeanNamesForType(Person.class);
//        Person person = context.getBean(Person.class);
//        String[] names = context.getBeanNamesForType(Vehicle.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);
//        vehicle.getVehicleServices().playMusic();
//        vehicle.getVehicleServices().moveVehicle();
//        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
//        VehicleServices vehicleServices2 = context.getBean(VehicleServices.class);
//        System.out.println(vehicleServices1.hashCode());
//        System.out.println(vehicleServices2.hashCode());
//        if (vehicleServices1.hashCode() != vehicleServices2.hashCode()) {
//            System.out.println("Multiple object instances created");
//        }
//        System.out.println("Before");
//        Person person = context.getBean(Person.class);
//        System.out.println("After");

    }
}

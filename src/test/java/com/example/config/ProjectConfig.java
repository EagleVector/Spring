package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
//public class ProjectConfig {
//
//    @Bean
//    Vehicle vehicle1() {
//        var veh = new Vehicle();
//        veh.setName("Audi 8");
//        return veh;
//    }
//
//    @Bean(name="audiVehicle")
//    Vehicle vehicle2() {
//        var veh = new Vehicle();
//        veh.setName("Audi R8");
//        return veh;
//    }
//
//    @Primary
//    @Bean(name="ferrariVehicle")
//    Vehicle vehicle3() {
//        var veh = new Vehicle();
//        veh.setName("Audi EV");
//        return veh;
//    }
//
//    @Bean
//    String hello() {
//        return "Hello World";
//    }
//
//    @Bean
//    Integer number() {
//        return 9;
//    }
//}

//@ComponentScan(basePackages = "com.example.beans")
@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle());
        return person;
    }
}

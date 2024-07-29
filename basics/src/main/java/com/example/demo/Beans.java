package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean(name = "a")
    public Engine createEngine1(){
        return new Engine(1500, "1.5L TSI");
    }

    @Bean(name = "b")
    public Engine createEngine2(){
        return new Engine(2000, "2.0L TSI");
    }

    @Bean
    public Car createCar(){
        return new Car("Skoda Superb", "Candy White", null);
    }

}
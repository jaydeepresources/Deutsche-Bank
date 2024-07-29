package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// Get engine object

		ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);

		// Manual wiring of internally contained objects
//		Car car1 = context.getBean(Car.class);
//		Engine engine1 = context.getBean(Engine.class);
//		car1.setEngine(engine1);
//		System.out.println(car1);

		// Autowiring of Engine

		Car car2 = context.getBean(Car.class);
		System.out.println(car2);


	}

}
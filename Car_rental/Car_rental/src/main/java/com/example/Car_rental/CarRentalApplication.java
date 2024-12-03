package com.example.Car_rental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CarRentalApplication.class, args);


		CarService carService = context.getBean(CarService.class);

		carService.carRent(1);
		carService.carRent(2);
		carService.carRent(3);
		carService.carRent(4);
	}
}

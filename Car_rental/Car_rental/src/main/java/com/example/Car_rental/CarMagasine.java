package com.example.Car_rental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CarMagasine {

    ArrayList<Car> carList = new ArrayList<>();

    public void list() {

        carList.add(new Car("Honda", "Civic VIII", "SHHFK8790MU000429", "UltraPremium", 1, false));
        carList.add(new Car("Toyota", "Celica", "SHHFK8790MU001234", "Decent", 2, false));
        carList.add(new Car("BMW", "E46", "SHHFK8790MU000429", "Cheap", 3, false));
        carList.add(new Car("Jeep", "Renegade", "SHHFK8790MU000987", "SUV", 4, false));
        carList.add(new Car("Mercedes", "W190", "SHHFK8790MU006571", "Premium", 5, false));

    }

    public Car findCarById(int id) {
        for (Car car : carList) {
            if (car.getCarId() == id) {
                return car;
            }
        }
        return null;
    }


    public boolean isCarAvailable(int id) {
        for (Car car : carList) {
            if (car.getCarId() == id) {
                return !car.isReserved();
            }
        }
        return false;
    }
}

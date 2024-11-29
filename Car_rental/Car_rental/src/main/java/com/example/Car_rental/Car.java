package com.example.Car_rental;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter


public class Car {
    String brand;
    String model;
    String vin;
    String carStandard;
    int carId;
    boolean isReserved;

    public Car(String brand, String model, String vin, String carStandard, int carId, boolean isReserved) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.carStandard = carStandard;
        this.carId = carId;
        this.isReserved = false;
    }
}


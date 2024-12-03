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
    double basePrice;

    public Car(String brand, String model, String vin, String carStandard, int carId, boolean isReserved, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.carStandard = carStandard;
        this.carId = carId;
        this.isReserved = false;
        this.basePrice = basePrice;
    }

    public double calculateBasePrice(double basePrice){
        switch(carStandard){
        case "UltraPremium" : return 500;
            case "Decent" : return 100;
            case "SUV" : return 150;
            case "Premium" : return 450;
            default : return 300;
        }
    }
}








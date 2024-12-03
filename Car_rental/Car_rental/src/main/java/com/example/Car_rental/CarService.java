package com.example.Car_rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
public CarMagasine carMagasine;

@Autowired
    public CarService(CarMagasine carMagasine) {
        this.carMagasine = carMagasine;
    }

    public void carRent(int carId) {
    Car car = carMagasine.findCarById(carId);
            if(!car.isReserved){
                car.setReserved(true);
                System.out.println(car.getBrand() + car.getModel() + "Has been reserved");
            }

            else {
                System.out.println("Car" + car.getBrand() + car.getModel() + "Is already reserved");
            }


//TODO: Localdate dla kalendarza rezerwacji 
    }


}

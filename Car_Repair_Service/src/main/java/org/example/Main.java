package org.example;

import lombok.Setter;

@Setter
public class Main {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.setModel("Civic");
        honda.setBody("RED");
        honda.setWheels(236);

        Car toyota = new Car();
        toyota.setModel("Celica");
        toyota.setBody("Blue");
        toyota.setWheels(230);

        Car lexus = new Car();
        lexus.setModel("is200");
        lexus.setBody("White");
        lexus.setWheels(220);
        System.out.println(honda);
    }
}
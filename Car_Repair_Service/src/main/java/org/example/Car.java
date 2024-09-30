package org.example;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter

public class Car {
    @NonNull
    private String model;
    @NonNull
    private String body;
    @NonNull
    private int wheels;

    public Car(@NonNull String model, @NonNull String body, @NonNull int wheels) {
        this.model = model;
        this.body = body;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return  model + " " +
                body + " " +
                wheels + "km/h";
    }
}


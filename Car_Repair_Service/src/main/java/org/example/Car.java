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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", body='" + body + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}


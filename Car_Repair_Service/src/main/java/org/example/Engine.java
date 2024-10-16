package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Engine {
    private String modelEngine;
    private double capacity;

    public Engine(String modelEngine, double capacity) {
        this.modelEngine = modelEngine;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return modelEngine + " " +
                capacity ;
    }
}

package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Pizza {
    double price;
    String name;

    public Pizza(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void menu() {
        List<Pizza> menu = new ArrayList<>();
        menu.add(new Pizza(10, "Margharita"));
        menu.add(new Pizza(12, "Capriciosa"));
        menu.add(new Pizza(14, "Hawaii"));
    }
}
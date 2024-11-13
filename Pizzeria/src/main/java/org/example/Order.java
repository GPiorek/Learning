package org.example;


import java.util.ArrayList;
import java.util.List;

public class Order {
    int id;
    int customerId;

    public Order(int id, int customerId, List<Pizza> pizzalist) {
        this.id = id;
        this.customerId = customerId;
        this.pizzalist = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        this.pizzalist.add(pizza);
    }

    List<Pizza> pizzalist;


}

package com.example.simple_shop.Product;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductStorage {

    public List<Product> products;

    public ProductStorage(List<Product> products) {
        products.add(new Product("Milk", 5.50));
        products.add(new Product("Corona beer", 7.20));
        products.add(new Product("Milk stout", 10.30));
        products.add(new Product("Wheat beer", 8.50));
        products.add(new Product("Cheese", 7.50));
        products.add(new Product("Grilled octopus", 35.99));
        products.add(new Product("Chicken beast", 15.50));
        products.add(new Product("Bubble gum", 2.99));
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}

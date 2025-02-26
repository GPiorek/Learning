package com.example.simple_shop.Item;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemStorage {

    List<Item> items;
    public ItemStorage(List<Item> items) {
        this.items = items;
        items.add(new Item("Milk", 5.50));
        items.add(new Item("Corona beer", 7.20));
        items.add(new Item("Milk stout", 10.30));
        items.add(new Item("Wheat beer", 8.50));
        items.add(new Item("Cheese", 7.50));
        items.add(new Item("Grilled octopus", 35.99));
        items.add(new Item("Chicken beast", 15.50));
        items.add(new Item("Bubble gum", 2.99));
    }

    public List<Item> getListOfItems() {
        return items;
    }

    public void addItemToList(Item item) {
        items.add(item);
    }

}

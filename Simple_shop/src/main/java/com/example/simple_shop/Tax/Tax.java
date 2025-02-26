package com.example.simple_shop.Tax;

public enum Tax {
    FOOD(8),
    DRINKS(23);


    public final int VatTax;
    Tax(int VatTax) {
        this.VatTax = VatTax;
    }
}

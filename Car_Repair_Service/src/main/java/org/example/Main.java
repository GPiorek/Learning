package org.example;

import lombok.Setter;

@Setter
public class Main {
    public static void main(String[] args) {
        Colour colourHonda = Colour.fromHex(0xFFFF);
        Car honda = new Car("Civic", colourHonda.name(), 236);
        Colour colourToyota = Colour.fromHex(0x001F);
        Car toyota = new Car("Celica", colourToyota.name(), 230);
        Colour colourLexus = Colour.fromHex(0xF800);
        Car lexus = new Car("is200", colourLexus.name(), 220);

        System.out.println("Honda " + honda);
        System.out.println("Toyota " + toyota);
        System.out.println("Lexus " + lexus);


    }
}
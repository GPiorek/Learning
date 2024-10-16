package org.example;

import lombok.Setter;

@Setter
public class Main {
    public static void main(String[] args) {
        Colour colourHonda = Colour.fromHex(0xFFFF);
        Engine engineHonda = new Engine("Vtec", 2.0);
        Car honda = new Car("Civic", colourHonda.name(), 236, engineHonda);
        Colour colourToyota = Colour.fromHex(0x001F);
        Engine engineToyota = new Engine("1ZZ-FE", 1.8);
        Car toyota = new Car("Celica", colourToyota.name(), 230,engineToyota);
        Colour colourLexus = Colour.fromHex(0xF800);
        Engine engineLexus = new Engine("1G-FE", 2.0);
        Car lexus = new Car("is200", colourLexus.name(), 220, engineLexus);



        System.out.println("Honda " + honda);
        System.out.println("Toyota " + toyota);
        System.out.println("Lexus " + lexus);


    }
}
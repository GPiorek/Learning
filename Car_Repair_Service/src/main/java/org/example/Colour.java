package org.example;

import lombok.NoArgsConstructor;


public enum Colour {
    RED(0xF800),
    BLUE(0x001F),
    WHITE(0xFFFF);


    private final int hexadecimal;

    Colour(int hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public static Colour fromHex(int hex) {
        if(hex == 0xF800){
            return RED;
        }
        else if (hex == 0x001F){
            return BLUE;
        }
        else if (hex == 0xFFFF){
            return WHITE;
        }
        else throw new IllegalArgumentException("No colour for value");
    }
}

package com.demo.girlcomponent;

import com.demo.girlinterface.Outfit;

public class Naked implements Outfit {
    @Override
    public void wear() {
        System.out.println("ngượng quá điii!!!");
    }

    @Override
    public String toString() {
        return "Naked";
    }
}

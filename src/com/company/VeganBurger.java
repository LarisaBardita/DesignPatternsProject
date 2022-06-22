package com.company;

public class VeganBurger extends Burger {

    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "Vegan Burger";
    }
}

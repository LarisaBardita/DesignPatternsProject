package com.company;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 30.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

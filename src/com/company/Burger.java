package com.company;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Plate();
    }

    @Override
    public abstract float price();
}

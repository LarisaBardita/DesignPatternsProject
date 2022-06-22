package com.company;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Glass();
    }

    @Override
    public abstract float price();
}

package com.company;

public class MealBuilder {

    private static MealBuilder singleInstance = null;

    private MealBuilder(){

    }

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VeganBurger());
        meal.addItem(new Fanta());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public static MealBuilder getInstance(){
        if(singleInstance == null)
            singleInstance = new MealBuilder();

        return singleInstance;
    }
}

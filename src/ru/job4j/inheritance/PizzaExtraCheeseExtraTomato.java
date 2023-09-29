package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends Pizza {
    private static final String NAME_PIZZA_CHEESE = "extra cheese";
    private static final String NAME_PIZZA_TOMATO = "extra tomato";

    @Override
    public String name() {
        return super.name() + " + " + NAME_PIZZA_CHEESE + " + " + NAME_PIZZA_TOMATO;
    }
}

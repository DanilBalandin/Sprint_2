package com.practicum.sprint_2.model;

public class Meat extends Food {


    public Meat(int amount, double price) {
        super(amount, price);
        super.isVegetarian = false;

    }

    @Override
    public double getDiscount() {
        return 0;
    }
}

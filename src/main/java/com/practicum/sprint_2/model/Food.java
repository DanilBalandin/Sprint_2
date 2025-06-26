package com.practicum.sprint_2.model;

abstract public class Food implements Discountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian = true;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public double getTotalPrice() {
        return price * amount;
    }

}

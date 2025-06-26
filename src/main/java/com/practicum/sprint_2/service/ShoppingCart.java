package com.practicum.sprint_2.service;

import com.practicum.sprint_2.model.Food;

public class ShoppingCart {

    private final Food[] foods;

public ShoppingCart(Food[] foods) {
    this.foods = foods;
}

public double getTotalPrice() {
    double totalPrice = 0;

    for (Food food : foods) {
        totalPrice += food.getTotalPrice();
    }
    return totalPrice;
}
}

package com.practicum.sprint_2.service;

import com.practicum.sprint_2.model.Food;

public class ShoppingCart {

    private final Food[] foods;

public ShoppingCart(Food[] foods) {
    this.foods = foods;
}

public double getTotalPriceWithoutDiscount() {
    double totalPrice = 0;

    for (Food food : foods) {
        totalPrice += food.getTotalPrice();
    }
    return totalPrice;
}

public double getTotalPriceWithDiscount() {
    double totalPrice = 0;
        for (Food food : foods) {
        totalPrice += food.getTotalPrice() * (1 - food.getDiscount() / 100);
        }
    return totalPrice;
}

public double getTotalPriceForVegetarianFood() {
    double totalPrice = 0;
    for (Food food : foods) {
    if (food.isVegetarian()) {
        totalPrice += food.getTotalPrice() * (1 - food.getDiscount() / 100);;
            }
        }
    return totalPrice;
    }
}

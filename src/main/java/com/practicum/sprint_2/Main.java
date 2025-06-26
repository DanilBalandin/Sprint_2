package com.practicum.sprint_2;

import com.practicum.sprint_2.model.constants.Colour;
import com.practicum.sprint_2.model.constants.Discount;
import com.practicum.sprint_2.model.Apple;
import com.practicum.sprint_2.model.Discountable;
import com.practicum.sprint_2.model.Food;
import com.practicum.sprint_2.model.Meat;
import com.practicum.sprint_2.service.ShoppingCart;

import static com.practicum.sprint_2.model.constants.Colour.COLOUR_RED;
import static com.practicum.sprint_2.model.constants.Colour.COLOUR_GREEN;

public class Main {
    public static void main(String[] args) {
         Food[] foods = {
                new Apple(8, 60, COLOUR_GREEN),
                new Apple(10, 50, COLOUR_RED),
                new Meat(5, 100)
        };

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println(shoppingCart.getTotalPriceWithoutDiscount());
        System.out.println(shoppingCart.getTotalPriceWithDiscount());
        System.out.println(shoppingCart.getTotalPriceForVegetarianFood());
    }
}

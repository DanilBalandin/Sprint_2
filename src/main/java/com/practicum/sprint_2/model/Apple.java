package com.practicum.sprint_2.model;

import static com.practicum.sprint_2.model.constants.Discount.DISCOUNT_PERCENT;
import static com.practicum.sprint_2.model.constants.Colour.COLOUR_RED;
import static com.practicum.sprint_2.model.constants.Colour.COLOUR_GREEN;

public class Apple extends Food {

    public final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
    }


    @Override
    public double getDiscount() {
        return COLOUR_RED.equals(colour) ? DISCOUNT_PERCENT : 0;
    }

}

package com.billing.domain.model;

/**
 * Represents a food product in the billing system.
 * Extends the AbstractProduct class and provides a specific icon for food products.
 * @author Ana Lizcano
 * @since 1.0
 */
public class FoodProduct extends AbstractProduct {

    /**
     * Constructs a new FoodProduct object with the given name, price, and icon.
     *
     * @param name  the name of the food product
     * @param price the price of the food product
     */
    public FoodProduct(String name, double price) {
        super(name, price, "FOOD🌮");
    }
}
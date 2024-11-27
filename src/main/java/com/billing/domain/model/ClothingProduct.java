package com.billing.domain.model;

/**
 * Represents a clothing product in the billing system.
 * Extends the AbstractProduct class and provides a specific constructor for clothing products.
 * @author Ana Lizcano
 * @since 1.0
 */
public class ClothingProduct extends AbstractProduct {

    /**
     * Constructs a new ClothingProduct object with the given name, price, and category.
     *
     * @param name  the name of the clothing product
     * @param price the price of the clothing product
     */
    public ClothingProduct(String name, double price) {
        super(name, price, "CLOTHING👗");
    }
}
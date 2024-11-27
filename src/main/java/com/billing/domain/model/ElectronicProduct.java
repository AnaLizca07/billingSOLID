package com.billing.domain.model;

/**
 * Represents an electronic product in the billing system.
 * Extends the AbstractProduct class and provides a specific constructor for electronic products.
 * @author Ana Lizcano
 * @since 1.0
 */
public class ElectronicProduct extends AbstractProduct {

    /**
     * Constructs a new electronic product with the given name, price, and category.
     *
     * @param name  the name of the electronic product
     * @param price the price of the electronic product
     */
    public ElectronicProduct(String name, double price) {
        super(name, price, "ELECTRONICS💻");
    }
}

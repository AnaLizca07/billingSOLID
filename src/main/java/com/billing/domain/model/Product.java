package com.billing.domain.model;

/**
 * Represents a product in the billing system.
 *
 * @author Ana Lizcano
 * @since 1.0
 */
public interface Product {

    /**
     * Returns the name of the product.
     *
     * @return the name of the product
     */
    String getName();

    /**
     * Returns the price of the product.
     *
     * @return the price of the product
     */
    double getPrice();

    /**
     * Returns the category of the product.
     *
     * @return the category of the product
     */
    String getCategory();
}

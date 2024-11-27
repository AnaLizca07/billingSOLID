package com.billing.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * This is an abstract class representing a product in the billing system.
 * It provides a basic structure for concrete product implementations.
 *
 * @author Ana Lizcano
 * @since 1.0
 */
@Getter
@AllArgsConstructor
public abstract class AbstractProduct implements Product {

    /**
     * The name of the product.
     */
    private final String name;

    /**
     * The price of the product.
     */
    private final double price;

    /**
     * The category of the product.
     */
    private final String category;
}
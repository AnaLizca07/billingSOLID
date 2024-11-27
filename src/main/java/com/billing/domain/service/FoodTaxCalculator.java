package com.billing.domain.service;

import org.springframework.stereotype.Component;

/**
 * This class is responsible for calculating the tax on food items.
 * It implements the TaxCalculator interface and provides a method to calculate the tax based on the item category and amount.
 *
 * @author Ana Lizcano
 * @since 1.0
 */
@Component
public class FoodTaxCalculator implements TaxCalculator {

    /**
     * Calculates the tax for a given food item category and amount.
     *
     * @param category The category of the food item. It should be "FOOD🌮" for this calculator to apply.
     * @param amount The amount of the food item.
     * @return The tax amount for the food item. If the category is not "FOOD🌮", it returns 0.
     */
    @Override
    public double calculateTax(String category, double amount) {
        if (!"FOOD🌮".equals(category)) {
            return 0;
        }
        return amount * 0.10;
    }
}
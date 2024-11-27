package com.billing.domain.service;

/**
 * This class implements the TaxCalculator interface and calculates the tax for electronics items.
 * @author Ana Lizcano
 * @since 1.0
 */
public class ElectronicsTaxCalculator implements TaxCalculator {

    /**
     * Calculates the tax for a given category and amount.
     *
     * @param category The category of the item. It should be "ELECTRONICS💻" for this calculator.
     * @param amount The amount of the item.
     * @return The tax amount for the given category and amount. If the category is not "ELECTRONICS💻", it returns 0.
     */
    @Override
    public double calculateTax(String category, double amount) {
        if (!"ELECTRONICS💻".equals(category)) {
            return 0;
        }
        return amount * 0.20;
    }
}
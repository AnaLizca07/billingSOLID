package com.billing.domain.service;

/**
 * This class implements the TaxCalculator interface and calculates the tax for clothing items.
 * @author Ana Lizcano
 * @since 1.0
 */
public class ClothingTaxCalculator implements TaxCalculator {

    /**
     * Calculates the tax for clothing items based on the given category and amount.
     *
     * @param category The category of the item. It should be "CLOTHING👗" for this calculator.
     * @param amount The amount of the item before tax.
     * @return The tax amount for clothing items. If the category is not "CLOTHING👗", it returns 0.
     */
    @Override
    public double calculateTax(String category, double amount) {
        if (!"CLOTHING👗".equals(category)) {
            return 0;
        }
        return amount * 0.15;
    }
}

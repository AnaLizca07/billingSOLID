package com.billing.domain.service;

/**
 * This interface defines a contract for calculating taxes based on a given category and amount.
 *
 * @author Ana Lizcano
 * @since 1.0
 */
public interface TaxCalculator {

    /**
     * Calculates the tax for a given category and amount.
     *
     * @param category The category for which the tax is being calculated.
     * @param amount The amount for which the tax is being calculated.
     * @return The calculated tax amount.
     */
    double calculateTax(String category, double amount);
}

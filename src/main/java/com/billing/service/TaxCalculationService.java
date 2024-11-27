package com.billing.service;

import com.billing.domain.service.TaxCalculator;
import com.billing.exception.BillingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service is responsible for calculating taxes based on the provided product category and amount.
 * It utilizes a list of tax calculators to perform the calculations.
 *
 * @author Ana Lizcano
 * @since 1.0
 */
@Service
@RequiredArgsConstructor
public class TaxCalculationService {

    /**
     * A list of tax calculators that will be used to calculate taxes.
     */
    private final List<TaxCalculator> taxCalculators;

    /**
     * Calculates the total tax for a given product category and amount.
     *
     * @param category The category of the product. Cannot be null or empty.
     * @param amount The amount for which tax needs to be calculated.
     * @return The total tax calculated for the given category and amount.
     * @throws BillingException If the product category is null or empty, or if the tax calculation results in a negative amount.
     */
    public double calculateTax(String category, double amount) {
        if (category == null || category.trim().isEmpty()) {
            throw new BillingException("Product category cannot be null or empty");
        }

        double totalTax = taxCalculators.stream()
                .mapToDouble(calculator -> calculator.calculateTax(category, amount))
                .sum();

        // Additional validations can be added here
        if (totalTax < 0) {
            throw new BillingException("Tax calculation resulted in negative amount");
        }

        return totalTax;
    }
}

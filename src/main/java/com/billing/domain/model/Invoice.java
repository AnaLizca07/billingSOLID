package com.billing.domain.model;

import com.billing.domain.service.TaxCalculator;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Represents an Invoice in the billing system.
 * @author Ana Lizcano
 * @since 1.0
 */
@Getter
public class Invoice {
    private final String invoiceNumber;
    private final LocalDateTime dateTime;
    private final List<Product> products;
    private double totalAmount;
    private double totalTax;

    /**
     * Constructs a new Invoice with a unique invoice number, current date and time, and an empty list of products.
     */
    public Invoice() {
        this.invoiceNumber = UUID.randomUUID().toString();
        this.dateTime = LocalDateTime.now();
        this.products = new ArrayList<>();
    }

    /**
     * Adds a product to the invoice.
     *
     * @param product The product to be added.
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Calculates the total amount and total tax for the products in the invoice.
     *
     * @param taxCalculator The tax calculator service to be used for calculating taxes.
     */
    public void calculateTotals(TaxCalculator taxCalculator) {
        totalAmount = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        totalTax = products.stream()
                .mapToDouble(product ->
                        taxCalculator.calculateTax(product.getCategory(), product.getPrice()))
                .sum();
    }

    /**
     * Returns the final amount of the invoice, which is the sum of the total amount and total tax.
     *
     * @return The final amount of the invoice.
     */
    public double getFinalAmount() {
        return totalAmount + totalTax;
    }
}
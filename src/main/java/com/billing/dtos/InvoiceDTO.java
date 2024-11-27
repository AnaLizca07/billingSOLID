package com.billing.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This class represents an Invoice Data Transfer Object (DTO). It contains the necessary information
 * to create and manage invoices.
 * @author Ana Lizcano
 * @since 1.0
 */
@Data
public class InvoiceDTO {

    /**
     * The unique identifier for the invoice.
     */
    private String invoiceNumber;

    /**
     * The date and time when the invoice was created.
     */
    private LocalDateTime dateTime;

    /**
     * A list of products included in the invoice.
     */
    private List<ProductDTO> productDTOList;

    /**
     * The total amount of the products before tax.
     */
    private double totalAmount;

    /**
     * The total tax amount for the products.
     */
    private double totalTax;

    /**
     * The final amount of the invoice after adding the total tax.
     */
    private double finalAmount;
}

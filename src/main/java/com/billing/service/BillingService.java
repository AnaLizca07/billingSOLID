package com.billing.service;

import com.billing.domain.model.Invoice;
import com.billing.dtos.CreateInvoiceRequest;
import com.billing.dtos.InvoiceDTO;
import lombok.RequiredArgsConstructor;
import com.billing.mappers.BillingMapper;
import org.springframework.stereotype.Service;

/**
 * This service is responsible for managing billing operations.
 * @author Ana Lizcano
 * @since 1.0
 */
@Service
@RequiredArgsConstructor
public class BillingService {
    private final TaxCalculationService taxCalculationService;
    private final BillingMapper billingMapper;

    /**
     * Creates a new invoice based on the provided request.
     *
     * @param request The request containing the necessary data to create an invoice.
     * @return The created invoice in DTO format.
     */
    public InvoiceDTO createInvoice(CreateInvoiceRequest request) {
        Invoice invoice = new Invoice();

        request.getProductDTOList().stream()
                .map(billingMapper::toProduct)
                .forEach(invoice::addProduct);

        invoice.calculateTotals(taxCalculationService::calculateTax
        );

        return billingMapper.toInvoiceDTO(invoice);
    }
}
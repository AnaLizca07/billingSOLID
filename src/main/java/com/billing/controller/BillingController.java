package com.billing.controller;

import com.billing.dtos.CreateInvoiceRequest;
import com.billing.dtos.InvoiceDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.billing.service.BillingService;

/**
 * This controller handles HTTP requests related to billing operations.
 * @author Ana Lizcano
 * @since 1.0
 */
@RestController
@RequestMapping("/billing")
@RequiredArgsConstructor
public class BillingController {

    /**
     * Service for performing billing-related operations.
     */
    private final BillingService billingService;

    /**
     * Creates a new invoice based on the provided request data.
     *
     * @param request The request data containing details for creating the invoice.
     * @return The created invoice, represented as an {@link InvoiceDTO} object.
     */
    @PostMapping("/invoices")
    public InvoiceDTO createInvoice(@RequestBody @Valid CreateInvoiceRequest request) {
        return billingService.createInvoice(request);
    }
}

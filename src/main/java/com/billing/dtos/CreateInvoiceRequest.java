package com.billing.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

/**
 * Represents a request to create a new invoice.
 * Contains a list of products to be included in the invoice.
 * @author Ana Lizcano
 * @since 1.0
 */
@Data
public class CreateInvoiceRequest {

    /**
     * The list of products to be included in the invoice.
     * Cannot be empty.
     *
     * @param productDTOList a list of {@link ProductDTO} objects
     */
    @NotEmpty(message = "products list cannot be emptyyy")
    @Valid
    private List<ProductDTO> productDTOList;
}

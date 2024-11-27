package com.billing.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Data;

/**
 * This class represents a product's data transfer object (DTO). It is used to transfer product information between different layers of the application.
 *
 * @author Ana Lizcano
 * @since 1.0
 */
@Data
public class ProductDTO {

    /**
     * The name of the product. It cannot be empty.
     */
    @NotEmpty(message = "product name is necessary!!!!")
    private String name;

    /**
     * The price of the product. It must be a positive number.
     */
    @Positive(message = "price is obligatory")
    private double price;

    /**
     * The category of the product. It cannot be empty.
     */
    @NotEmpty(message = "category is necessary")
    private String category;
}

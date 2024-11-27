package com.billing.domain.factory;

import com.billing.domain.model.ClothingProduct;
import com.billing.domain.model.ElectronicProduct;
import com.billing.domain.model.FoodProduct;
import com.billing.domain.model.Product;
import com.billing.exception.BillingException;
import org.springframework.stereotype.Component;

/**
 * Factory class for creating different types of products based on their category.
 *
 * @author Ana Lizcano
 * @since 1.0
 */
@Component
public class ProductFactory {

    /**
     * Creates a new product based on the given category, name, and price.
     *
     * @param category The category of the product. It can be "ELECTRONICS💻", "FOOD🌮", or "CLOTHING👗".
     * @param name The name of the product.
     * @param price The price of the product.
     * @return A new instance of the product based on the given category.
     * @throws BillingException If the category is invalid.
     */
    public Product createProduct(String category, String name, double price) {
        return switch (category.toUpperCase()) {
            case "ELECTRONICS💻" -> new ElectronicProduct(name, price);
            case "FOOD🌮" -> new FoodProduct(name, price);
            case "CLOTHING👗" -> new ClothingProduct(name, price);
            default -> throw new BillingException("Invalid product category: " + category);
        };
    }
}

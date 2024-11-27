package com.billing.config;

import com.billing.domain.service.ClothingTaxCalculator;
import com.billing.domain.service.ElectronicsTaxCalculator;
import com.billing.domain.service.FoodTaxCalculator;
import com.billing.domain.service.TaxCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This class is responsible for configuring the TaxCalculator beans in the Spring application context.
 * @author Ana Lizcano
 * @since 1.0
 */
@Configuration
public class BillingConfig {

    /**
     * Creates a TaxCalculator bean for food items.
     *
     * @return a TaxCalculator instance for food items
     */
    @Bean
    public TaxCalculator foodTaxCalculator1() {
        return new FoodTaxCalculator();
    }

    /**
     * Creates a TaxCalculator bean for electronics items.
     *
     * @return a TaxCalculator instance for electronics items
     */
    @Bean
    public TaxCalculator electronicsTaxCalculator() {
        return new ElectronicsTaxCalculator();
    }

    /**
     * Creates a TaxCalculator bean for clothing items.
     *
     * @return a TaxCalculator instance for clothing items
     */
    @Bean
    public TaxCalculator clothingTaxCalculator() {
        return new ClothingTaxCalculator();
    }
}
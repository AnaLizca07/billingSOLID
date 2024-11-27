package com.billing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * This class represents the configuration properties for the billing application.
 * It uses Spring Boot's {@code @ConfigurationProperties} annotation to bind properties from the application's configuration file.
 * The properties are grouped under the 'billing' prefix.
 * @author Ana Lizcano
 * @since 1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "billing")
public class BillingProperties {

    /**
     * The tax configuration for different product categories.
     */
    private Tax tax = new Tax();

    /**
     * This inner class represents the tax configuration for different product categories.
     */
    @Data
    public static class Tax {

        /**
         * The tax rate for food products. Default value is 0.10.
         */
        private double foodRate = 0.10;

        /**
         * The tax rate for electronics products. Default value is 0.20.
         */
        private double electronicsRate = 0.20;

        /**
         * The tax rate for clothing products. Default value is 0.15.
         */
        private double clothingRate = 0.15;
    }
}

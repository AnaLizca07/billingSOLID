package com.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * The main entry point of the Billing Application.
 * This class is annotated with {@link SpringBootApplication}, {@link ComponentScan}, and {@link EnableConfigurationProperties}
 * to enable Spring Boot auto-configuration, component scanning, and configuration properties support respectively.
 *
 * @author Ana Lizcano
 * @since 1.0
 */
@SpringBootApplication
@ComponentScan("com.billing")
@EnableConfigurationProperties
public class BillingApplication {

    /**
     * The main method to run the Spring Boot application.
     *
     * @param args The command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(BillingApplication.class, args);
    }
}
package com.billing.exception;

/**
 * Custom exception class for billing-related operations.
 * This class extends RuntimeException to allow unchecked exceptions.
 *
 * @author Ana Lizcano
 * @since 1.0
 */
public class BillingException extends RuntimeException {

    /**
     * Constructs a new BillingException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method)
     */
    public BillingException(String message) {
        super(message);
    }
}

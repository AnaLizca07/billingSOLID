package com.billing.exception;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * This class represents an error response that will be returned in case of any exception during the billing process.
 * It contains three properties: status, message, and timestamp.
 * @author Ana Lizcano
 * @since 1.0
 */
@Data
@AllArgsConstructor
public class ErrorResponse {

    /**
     * The HTTP status code of the error response.
     */
    private int status;

    /**
     * A detailed message describing the error.
     */
    private String message;

    /**
     * The timestamp when the error occurred.
     */
    private LocalDateTime timestamp;
}

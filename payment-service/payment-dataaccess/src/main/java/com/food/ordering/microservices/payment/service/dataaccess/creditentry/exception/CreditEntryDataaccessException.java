package com.food.ordering.microservices.payment.service.dataaccess.creditentry.exception;

public class CreditEntryDataaccessException extends RuntimeException {
    public CreditEntryDataaccessException(String message) {
        super(message);
    }
}

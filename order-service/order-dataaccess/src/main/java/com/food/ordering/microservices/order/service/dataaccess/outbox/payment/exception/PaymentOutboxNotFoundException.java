package com.food.ordering.microservices.order.service.dataaccess.outbox.payment.exception;

public class PaymentOutboxNotFoundException extends RuntimeException {
    public PaymentOutboxNotFoundException(String message) {
        super(message);
    }
}

package com.food.ordering.microservices.payment.service.domain.valueobject;

import com.food.ordering.microservices.domain.valueobject.BaseId;

import java.util.UUID;

public class PaymentId extends BaseId<UUID> {
    public PaymentId(UUID value) {
        super(value);
    }
}

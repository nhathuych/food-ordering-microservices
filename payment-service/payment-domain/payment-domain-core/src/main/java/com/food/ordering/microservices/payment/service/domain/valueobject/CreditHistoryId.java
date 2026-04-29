package com.food.ordering.microservices.payment.service.domain.valueobject;

import com.food.ordering.microservices.domain.valueobject.BaseId;

import java.util.UUID;

public class CreditHistoryId extends BaseId<UUID> {
    public CreditHistoryId(UUID value) {
        super(value);
    }
}

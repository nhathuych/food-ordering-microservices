package com.food.ordering.microservices.payment.service.domain.valueobject;

import com.food.ordering.microservices.domain.valueobject.BaseId;

import java.util.UUID;

public class CreditEntryId extends BaseId<UUID> {
    public CreditEntryId(UUID value) {
        super(value);
    }
}

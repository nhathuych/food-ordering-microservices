package com.food.ordering.microservices.restaurant.service.domain.valueobject;

import com.food.ordering.microservices.domain.valueobject.BaseId;

import java.util.UUID;

public class OrderApprovalId extends BaseId<UUID> {
    public OrderApprovalId(UUID value) {
        super(value);
    }
}

package com.food.ordering.microservices.order.service.domain.valueobject;

import com.food.ordering.microservices.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}

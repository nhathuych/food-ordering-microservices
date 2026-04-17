package com.food.ordering.microservices.order.service.domain.valueobject;

import com.food.ordering.microservices.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}

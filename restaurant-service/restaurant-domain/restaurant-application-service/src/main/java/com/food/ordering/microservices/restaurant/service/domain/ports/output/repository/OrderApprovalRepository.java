package com.food.ordering.microservices.restaurant.service.domain.ports.output.repository;

import com.food.ordering.microservices.restaurant.service.domain.entity.OrderApproval;

public interface OrderApprovalRepository {
    OrderApproval save(OrderApproval orderApproval);
}

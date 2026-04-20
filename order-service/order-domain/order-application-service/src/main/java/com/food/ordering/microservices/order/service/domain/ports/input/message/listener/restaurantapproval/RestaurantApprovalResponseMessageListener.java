package com.food.ordering.microservices.order.service.domain.ports.input.message.listener.restaurantapproval;

import com.food.ordering.microservices.order.service.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {
    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);
    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}

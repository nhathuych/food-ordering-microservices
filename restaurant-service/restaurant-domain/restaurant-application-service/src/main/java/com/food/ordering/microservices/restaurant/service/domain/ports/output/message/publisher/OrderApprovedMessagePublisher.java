package com.food.ordering.microservices.restaurant.service.domain.ports.output.message.publisher;

import com.food.ordering.microservices.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.microservices.restaurant.service.domain.event.OrderApprovedEvent;

public interface OrderApprovedMessagePublisher extends DomainEventPublisher<OrderApprovedEvent> {
}

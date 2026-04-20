package com.food.ordering.microservices.domain.event.publisher;

import com.food.ordering.microservices.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}

package com.food.ordering.microservices.domain.event;

public interface DomainEvent<T> {
    void fire();
}

package com.food.ordering.microservices.saga;

import com.food.ordering.microservices.domain.event.DomainEvent;

public interface SagaStep<T, S extends DomainEvent, U extends DomainEvent> {
    S process(T data);
    U rollback(T data);
}

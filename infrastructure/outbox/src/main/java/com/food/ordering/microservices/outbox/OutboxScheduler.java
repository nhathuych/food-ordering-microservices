package com.food.ordering.microservices.outbox;

public interface OutboxScheduler {
    void processOutboxMessage();
}

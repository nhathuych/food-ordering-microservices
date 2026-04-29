package com.food.ordering.microservices.payment.service.domain.ports.output.message.publisher;

import com.food.ordering.microservices.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.microservices.payment.service.domain.event.PaymentCompletedEvent;

public interface PaymentCompletedMessagePublisher extends DomainEventPublisher<PaymentCompletedEvent> {
}

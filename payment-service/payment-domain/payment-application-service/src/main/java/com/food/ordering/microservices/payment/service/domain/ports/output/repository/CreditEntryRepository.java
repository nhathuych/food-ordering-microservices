package com.food.ordering.microservices.payment.service.domain.ports.output.repository;

import com.food.ordering.microservices.domain.valueobject.CustomerId;
import com.food.ordering.microservices.payment.service.domain.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {
    CreditEntry save(CreditEntry creditEntry);
    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}

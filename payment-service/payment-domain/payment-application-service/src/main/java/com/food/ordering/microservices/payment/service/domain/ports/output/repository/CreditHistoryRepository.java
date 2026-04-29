package com.food.ordering.microservices.payment.service.domain.ports.output.repository;

import com.food.ordering.microservices.domain.valueobject.CustomerId;
import com.food.ordering.microservices.payment.service.domain.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

public interface CreditHistoryRepository {
    CreditHistory save(CreditHistory creditHistory);
    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}

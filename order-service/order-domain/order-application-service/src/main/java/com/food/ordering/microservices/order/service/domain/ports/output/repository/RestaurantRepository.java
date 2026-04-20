package com.food.ordering.microservices.order.service.domain.ports.output.repository;

import com.food.ordering.microservices.order.service.domain.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {
    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}

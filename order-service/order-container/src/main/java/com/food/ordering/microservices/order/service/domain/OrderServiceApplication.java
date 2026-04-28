package com.food.ordering.microservices.order.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.food.ordering.microservices.order.service.dataaccess", "com.food.ordering.microservices.dataaccess" })
@EntityScan(basePackages = { "com.food.ordering.microservices.order.service.dataaccess", "com.food.ordering.microservices.dataaccess"})
@SpringBootApplication(scanBasePackages = "com.food.ordering.microservices")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}

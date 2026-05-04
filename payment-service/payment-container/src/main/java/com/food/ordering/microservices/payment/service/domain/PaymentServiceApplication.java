package com.food.ordering.microservices.payment.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.food.ordering.microservices.payment.service.dataaccess")
@EntityScan(basePackages = "com.food.ordering.microservices.payment.service.dataaccess")
@SpringBootApplication(scanBasePackages = "com.food.ordering.microservices")
public class PaymentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);
    }
}

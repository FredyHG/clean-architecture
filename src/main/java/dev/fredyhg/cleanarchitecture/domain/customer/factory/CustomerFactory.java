package dev.fredyhg.cleanarchitecture.domain.customer.factory;

import dev.fredyhg.cleanarchitecture.domain.customer.entity.Customer;

import java.util.UUID;

public class CustomerFactory {

    public static Customer create(String name) {
        return new Customer(UUID.randomUUID().toString(), name);
    }

}

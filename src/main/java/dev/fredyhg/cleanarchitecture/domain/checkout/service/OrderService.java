package dev.fredyhg.cleanarchitecture.domain.checkout.service;

import dev.fredyhg.cleanarchitecture.domain.checkout.entity.Order;
import dev.fredyhg.cleanarchitecture.domain.checkout.entity.OrderItem;
import dev.fredyhg.cleanarchitecture.domain.customer.entity.Customer;

import java.util.List;
import java.util.UUID;

public class OrderService {

    public static Order placeOrder(Customer customer, List<OrderItem> items) {
        if (items.isEmpty()) {
            throw new RuntimeException("Order must have at least one item");
        }
        var order = new Order(items, customer.id, UUID.randomUUID().toString());

        return order;
    }


}

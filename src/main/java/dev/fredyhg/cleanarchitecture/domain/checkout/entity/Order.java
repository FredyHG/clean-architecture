package dev.fredyhg.cleanarchitecture.domain.checkout.entity;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private String id;
    private String customerId;
    private List<OrderItem> items;
    private Float total;

    public Order(List<OrderItem> items, String customerId, String id) {
        this.items = items;
        this.customerId = customerId;
        this.id = id;
    }

    public boolean validate() {
        if(this.id.isEmpty() || this.id.isBlank()) {
            throw new RuntimeException("Id is required");
        }
        if(this.customerId.isEmpty() || customerId.isBlank()) {
            throw new RuntimeException("CustomerId is required");
        }
        if(this.items.isEmpty()) {
            throw new RuntimeException("Items is required");
        }
        this.items.forEach(item -> {
            if (item.getQuantity() <= 0) {
                throw new RuntimeException("Quantity is required");
            }
        });

        return true;
    }

    public Float total() {
        return (float) items.stream().mapToDouble(OrderItem::getPrice).sum();
    }
}

package dev.fredyhg.cleanarchitecture.domain.checkout.entity;

import lombok.Data;

@Data
public class OrderItem {
    private String id;
    private String productId;
    private String name;
    private Float price;
    private int quantity;
}

package dev.fredyhg.cleanarchitecture.domain.checkout.factory;

import dev.fredyhg.cleanarchitecture.domain.checkout.entity.OrderItem;
import lombok.Data;

import java.util.List;

@Data
public class OrderFactoryProps {
    private String id;
    private String customerId;
    private List<OrderItem> items;
}

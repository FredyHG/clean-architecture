package dev.fredyhg.cleanarchitecture.domain.checkout.factory;

import dev.fredyhg.cleanarchitecture.domain.checkout.entity.Order;

public class OrderFactory {

    public static Order create(OrderFactoryProps props) {
        return new Order(props.getItems(), props.getCustomerId(), props.getId());
    }

}

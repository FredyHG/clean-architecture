package dev.fredyhg.cleanarchitecture.domain.checkout.repository;

import dev.fredyhg.cleanarchitecture.domain.checkout.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}

package ru.qlogistic.logic.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.qlogistic.logic.model.Order;

import java.util.Set;

public interface OrderRepostory extends JpaRepository<Order,Long> {
    public Set<Order> findOrdersBySenderId(Long id);
}

package ru.qlogistic.logic.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.qlogistic.logic.model.Order;

public interface OrderRepostory extends JpaRepository<Order,Long> {
}

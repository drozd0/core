package ru.qlogistic.logic.dao;

import ru.qlogistic.logic.model.Order;

import java.util.Set;

public interface OrderDao {
    void saveAndFlush(Order order);
    Order findUserById(Long id);
    public Set<Order> findOrdersBySenderId(Long id);
}

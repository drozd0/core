package ru.qlogistic.logic.dao;

import ru.qlogistic.logic.model.Order;

public interface OrderDao {
    void saveAndFlush(Order order);
    Order findUserById(Long id);
}

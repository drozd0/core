package ru.qlogistic.logic.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.qlogistic.logic.dao.OrderDao;
import ru.qlogistic.logic.model.Order;
import ru.qlogistic.logic.model.repository.OrderRepostory;

import java.util.Set;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao{

    @Autowired
    private OrderRepostory orderRepostory;

    @Override
    public void saveAndFlush(Order order) {
        orderRepostory.saveAndFlush(order);
    }

    @Override
    public Order findUserById(Long id) {
        return orderRepostory.findOne(id);
    }

    @Override
    public Set<Order> findOrdersBySenderId(Long id) {
        return orderRepostory.findOrdersBySenderId(id);
    }
}

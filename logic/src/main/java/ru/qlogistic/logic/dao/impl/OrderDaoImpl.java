package ru.qlogistic.logic.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.qlogistic.logic.dao.OrderDao;
import ru.qlogistic.logic.model.Order;
import ru.qlogistic.logic.model.repository.OrderRepostory;

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
}

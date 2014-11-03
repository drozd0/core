package ru.qlogistic.logic.dao;

import ru.qlogistic.logic.model.Customer;

public interface CustomerDao {
    public void saveAndFlush(Customer user);
    public Customer findUserById(Long id);
    public Customer findUserByUsername(String name);

}

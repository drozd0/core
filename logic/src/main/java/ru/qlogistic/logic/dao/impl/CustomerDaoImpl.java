package ru.qlogistic.logic.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.qlogistic.logic.dao.CustomerDao;
import ru.qlogistic.logic.model.Customer;
import ru.qlogistic.logic.model.repository.CustomerRepository;

@Repository("senderDao")
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void saveAndFlush(Customer user) {
        customerRepository.saveAndFlush(user);
    }

    @Override
    public Customer findUserById(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public Customer findUserByUsername(String name) {
        return customerRepository.findCustomerByUsername(name);
    }
}

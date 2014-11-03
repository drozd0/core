package ru.qlogistic.logic.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.qlogistic.logic.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    public Customer findCustomerByUsername(String name);
}

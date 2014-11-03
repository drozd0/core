package ru.qlogistic.logic.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.qlogistic.logic.dao.CourierDao;
import ru.qlogistic.logic.dao.UserDao;
import ru.qlogistic.logic.model.Courier;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.model.repository.CourierRepository;
import ru.qlogistic.logic.model.repository.UserRepository;

@Repository("courierDao")
public class CourierDaoImpl implements CourierDao {
    @Autowired
    private CourierRepository courierRepository;

    @Override
    public void saveAndFlush(Courier user) {
        courierRepository.saveAndFlush(user);
    }

    @Override
    public Courier findCourierById(Long id) {
        return courierRepository.findOne(id);
    }

    @Override
    public Courier findCourierByUsername(String name) {
        return courierRepository.findCourierByUsername(name);
    }
}

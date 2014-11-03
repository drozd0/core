package ru.qlogistic.logic.dao;

import ru.qlogistic.logic.model.Courier;

public interface CourierDao {
    public void saveAndFlush(Courier user);
    public Courier findCourierById(Long id);
    public Courier findCourierByUsername(String name);
}

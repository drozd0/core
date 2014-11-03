package ru.qlogistic.logic.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.qlogistic.logic.model.Courier;
import ru.qlogistic.logic.model.User;

public interface CourierRepository extends JpaRepository<Courier,Long> {
    Courier findCourierByUsername(String name);
}

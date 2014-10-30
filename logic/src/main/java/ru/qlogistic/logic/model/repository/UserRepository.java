package ru.qlogistic.logic.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.qlogistic.logic.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}

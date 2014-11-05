package ru.qlogistic.logic.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.qlogistic.logic.model.Role;

/**
 * User: anton
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(Long id);
}

package ru.qlogistic.logic.dao;

import ru.qlogistic.logic.model.Role;

/**
 * User: anton
 */
public interface RoleDao {
    Role findRoleById(Long id);
    void saveOrUpdateRole(Role role);
    Role findRoleByRole(String name);
}

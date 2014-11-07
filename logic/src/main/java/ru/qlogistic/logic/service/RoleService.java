package ru.qlogistic.logic.service;

import ru.qlogistic.logic.model.Role;

/**
 * User: anton
 */
public interface RoleService {
    Role findRoleById(Long id);
    void saveOrUpdateRole(Role role);
    Role findRoleByRole(String name);
}

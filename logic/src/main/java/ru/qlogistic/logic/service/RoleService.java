package ru.qlogistic.logic.service;

import ru.qlogistic.logic.model.Role;

/**
 * User: anton
 */
public interface RoleService {
    public Role findRoleById(Long id);
    public void saveOrUpdateRole(Role role);
}

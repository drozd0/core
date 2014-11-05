package ru.qlogistic.logic.dao;

import ru.qlogistic.logic.model.Role;

/**
 * User: anton
 */
public interface RoleDao {
    public Role findRoleById(Long id);
    public void saveOrUpdateRole(Role role);
}

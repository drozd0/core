package ru.qlogistic.logic.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.qlogistic.logic.dao.RoleDao;
import ru.qlogistic.logic.model.Role;
import ru.qlogistic.logic.model.repository.RoleRepository;

/**
 * User: anton
 */
@Repository("roleDao")
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRoleById(Long id) {
        return roleRepository.findRoleById(id);
    }

    @Override
    public void saveOrUpdateRole(Role role) {
        roleRepository.saveAndFlush(role);
    }

    @Override
    public Role findRoleByRole(String name) {
        return roleRepository.findRoleByRole(name);
    }
}

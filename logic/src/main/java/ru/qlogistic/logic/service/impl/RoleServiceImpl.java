package ru.qlogistic.logic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.qlogistic.logic.dao.RoleDao;
import ru.qlogistic.logic.model.Role;
import ru.qlogistic.logic.service.RoleService;

/**
 * User: anton
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findRoleById(Long id) {
        return roleDao.findRoleById(id);
    }

    @Override
    public void saveOrUpdateRole(Role role) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

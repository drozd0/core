package ru.qlogistic.logic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
    @Transactional
    public Role findRoleById(Long id) {
        return roleDao.findRoleById(id);
    }

    @Override
    @Transactional
    public void saveOrUpdateRole(Role role) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

package com.company.service.impl;

import com.company.dao.RolesRepository;
import com.company.entity.Roles;
import com.company.service.inter.RolesRepositoryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RolesRepositoryServiceImpl implements RolesRepositoryServiceInter {

    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public List<Roles> getAllGroups() {
        return rolesRepository.getAllGroups();
    }

    @Override
    public Roles findByName(String name) {
        return rolesRepository.findByName(name);
    }

    @Override
    public Roles findById(int groupId) {
        return rolesRepository.findById(groupId);
    }

    @Override
    public boolean removeByRoles(Integer roleId) {
        return rolesRepository.removeByRoles(roleId);
    }
}

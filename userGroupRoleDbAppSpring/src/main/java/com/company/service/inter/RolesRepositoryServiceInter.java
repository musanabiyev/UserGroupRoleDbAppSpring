package com.company.service.inter;

import com.company.entity.Roles;

import java.util.List;

public interface RolesRepositoryServiceInter {

    List<Roles> getAllGroups();

    Roles findByName(String name);

    Roles findById(int groupId);

    boolean removeByRoles(Integer roleId);
}

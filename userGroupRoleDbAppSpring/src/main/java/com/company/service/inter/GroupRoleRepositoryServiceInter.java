package com.company.service.inter;

import com.company.entity.GroupRole;

import java.util.List;

public interface GroupRoleRepositoryServiceInter {

    List<GroupRole> getGroupRoleByGroupRoleId(Integer id);

    boolean deleteByGroupRoleId(Integer groupRoleId);
}

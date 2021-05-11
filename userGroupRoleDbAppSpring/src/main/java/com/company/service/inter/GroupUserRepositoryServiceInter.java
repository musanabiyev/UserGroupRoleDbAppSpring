package com.company.service.inter;

import com.company.entity.GroupUser;

import java.util.List;

public interface GroupUserRepositoryServiceInter {

    List<GroupUser> getGroupUserByUserId(Integer id);

    List<GroupUser> getGroupUserByGroupId(Integer id);

    boolean deleteByGroupUserId(Integer groupUserId);
}

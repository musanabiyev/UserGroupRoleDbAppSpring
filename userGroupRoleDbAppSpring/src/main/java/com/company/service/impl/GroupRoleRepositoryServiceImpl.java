package com.company.service.impl;

import com.company.dao.GroupRoleRepository;
import com.company.entity.GroupRole;
import com.company.service.inter.GroupRoleRepositoryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GroupRoleRepositoryServiceImpl implements GroupRoleRepositoryServiceInter {

    @Autowired
    private GroupRoleRepository groupRoleRepository;

    @Override
    public List<GroupRole> getGroupRoleByGroupRoleId(Integer id) {
        return groupRoleRepository.getGroupRoleByGroupRoleId(id);
    }

    @Override
    public boolean deleteByGroupRoleId(Integer groupRoleId) {
        return groupRoleRepository.deleteByGroupRoleId(groupRoleId);
    }
}

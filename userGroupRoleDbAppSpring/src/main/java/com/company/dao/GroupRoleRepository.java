package com.company.dao;

import com.company.entity.GroupRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRoleRepository extends JpaRepository<GroupRole, Integer> {



   @Query(value = "select * from group_role where group_id = :id", nativeQuery = true)
   List<GroupRole> getGroupRoleByGroupRoleId(Integer id);

   @Query(value = "DELETE FROM group_role WHERE id = :groupRoleId", nativeQuery = true)
   boolean deleteByGroupRoleId(Integer groupRoleId);


}

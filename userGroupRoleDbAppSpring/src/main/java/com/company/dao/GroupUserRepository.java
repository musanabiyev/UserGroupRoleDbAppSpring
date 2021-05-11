package com.company.dao;

import com.company.entity.GroupUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupUserRepository extends JpaRepository<GroupUser, Integer> {

    @Query(value = "select * from group_user where user_id = :id", nativeQuery = true)
    List<GroupUser> getGroupUserByUserId(Integer id);

    @Query(value = "select * from group_user where group_id = :id", nativeQuery = true)
    List<GroupUser> getGroupUserByGroupId(Integer id);

    @Query(value = "DELETE FROM group_user WHERE id = :groupUserId", nativeQuery = true)
    boolean deleteByGroupUserId(Integer groupUserId);


    @Query(value = "INSERT INTO `resume2`.`group_user`(`group_id`, `user_id`) VALUES (:groupId, :groupUserId)",nativeQuery = true)
    boolean insertGroupUser(Integer groupId, Integer groupUserId);



}


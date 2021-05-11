package com.company.dao;

import com.company.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

    @Query(value = "SELECT * from roles", nativeQuery = true)
    List<Roles> getAllGroups();

    Roles findByName(String name);

    Roles findById(int groupId);

    @Query(value = "DELETE FROM roles WHERE id = :roleId", nativeQuery = true)
    boolean removeByRoles(Integer roleId);

}

package com.company.dao;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findByName(String alma);

    @Query("select u from User u where email = ?1")
    User findByEmail(String email);

    @Query(value = "select * from User u where u.name like %:keyword% or u.surname like %:keyword%", nativeQuery = true)
    List<User> findByKeyword(@Param("keyword") String keyword);

}

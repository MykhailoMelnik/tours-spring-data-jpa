package com.melnik.spring.springboot.dao;

import com.melnik.spring.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    public List<User> findAllById(String iduser);

}

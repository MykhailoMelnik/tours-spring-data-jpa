package com.melnik.spring.springboot.dao;

import com.melnik.spring.springboot.model.Tour;
import com.melnik.spring.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    public List<User> findAllById(String idUser);

}


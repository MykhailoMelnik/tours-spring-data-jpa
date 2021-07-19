package com.melnik.spring.springboot.service.user;

import com.melnik.spring.springboot.model.User;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

//        public List<User> findAllByName(String name);
//
//    public User getEmployee(int id);
//
//    public void deleteEmployee(int id);



}

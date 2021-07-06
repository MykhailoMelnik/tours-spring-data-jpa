package com.melnik.spring.springboot.service;

import com.melnik.spring.springboot.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllEmployees();

    public void saveEmployee(User user);

//        public List<User> findAllByName(String name);
//
//    public User getEmployee(int id);
//
//    public void deleteEmployee(int id);
//


}

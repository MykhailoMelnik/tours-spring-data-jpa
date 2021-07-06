package com.melnik.spring.springboot.service;


import com.melnik.spring.springboot.dao.UserRepository;
import com.melnik.spring.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllEmployees() {
        return userRepository.findAll();
    }

    @Override
    public void saveEmployee(User user) {
        userRepository.save(user);
    }

//    @Override
//    public List<User> findAllByName(String iduser) {
//        List<User> userList = userRepository.findAllById(iduser);
//        return userList;
//    }
//
//    @Override
//    public User getEmployee(String id) {
//        User user = null;
//        Optional<User> optional = employeeRepository.findById(id);
//        if (optional.isPresent()) {
//            user = optional.get();
//        }
//        return user;
//    }
//
//    @Override
//    public List<User> findAllByName(String name) {
//        List<User> userList = employeeRepository.findAllByName(name);
//        return userList;
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//        employeeRepository.deleteById(id);
//    }
}

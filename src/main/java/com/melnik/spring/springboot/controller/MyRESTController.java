package com.melnik.spring.springboot.controller;


import com.melnik.spring.springboot.entity.User;
import com.melnik.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MyRESTController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showAllEmployees() {
        List<User> users = userService.getAllEmployees();
        return users;
    }

    @PostMapping("/signin")
    public User saveUser(@RequestBody User user) {
        userService.saveEmployee(user);
        return user;
    }

//
//    @GetMapping("/employees/{id}")
//    public User getEmployee(@PathVariable int id) {
//        return employeeService.getEmployee(id);
//    }
//
//    @PostMapping("/employees")
//    public User saveEmployee(@RequestBody User user) {
//        employeeService.saveEmployee(user);
//        return user;
//    }
//
//    @PutMapping("/employees")
//    public User updateEmployee(@RequestBody User user) {
//        employeeService.saveEmployee(user);
//        return user;
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//        employeeService.deleteEmployee(id);
//        return "employee with id = " + id + "was deleted";
//    }
//
//    @GetMapping("/employee/name")
//    public List<User> findAllByName(@PathVariable String name) {
//        List<User> userList = employeeService.findAllByName(name);
//        return userList;
//    }
}

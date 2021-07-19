package com.melnik.spring.springboot.controller;

import com.melnik.spring.springboot.model.Tour;
import com.melnik.spring.springboot.model.User;
import com.melnik.spring.springboot.service.tours.TourService;
import com.melnik.spring.springboot.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tours")
public class RESTControlerTours {

    @Autowired
    private TourService tourService;

    @Autowired
    private UserService userService;


    @GetMapping("/all-tours")
    public List<Tour> showAllTours (){
        List<Tour> toursList = tourService.getAllTours();
        return toursList;
    }
    @GetMapping("/show-first-tours")
    public List<Tour> showAllToursFirst (){
        List<Tour> toursList = tourService.getAllToursFirst();
        return toursList;
    }
}

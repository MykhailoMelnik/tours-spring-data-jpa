package com.melnik.spring.springboot.service.tours;

import com.melnik.spring.springboot.model.Tour;

import java.util.List;


public interface TourService {
    List<Tour> getAllTours();
    List<Tour> getAllToursFirst();

}

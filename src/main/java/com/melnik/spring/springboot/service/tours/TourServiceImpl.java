package com.melnik.spring.springboot.service.tours;

import com.melnik.spring.springboot.model.Tour;
import com.melnik.spring.springboot.jsoup.ToursJsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private ToursJsoup toursJsoup;

    @Override
    public List<Tour> getAllTours() {
        List<Tour> toursList = toursJsoup.getAllTours();
        return toursList;
    }

    @Override
    public List<Tour> getAllToursFirst() {
        try {
            List<Tour> tourList = toursJsoup.getAllToursFirst();
            return tourList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

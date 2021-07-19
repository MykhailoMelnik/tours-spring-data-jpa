package com.melnik.spring.springboot.model;

import javax.persistence.Entity;


public class Tour {
    String Country;
    String Transport;
    String Region;
    String Hotel;
    String Stars;
    String Food;
    String startCity;
    String Nights;
    String Price;
    //  String tourId":"571007",
    String startDate;
//    String endDate;
//  String addTime":"15.07.2021 16:20"


    public Tour() {
    }

    public Tour(String country, String transport, String region, String hotel, String stars, String food, String startCity, String nights, String price, String startDate) {
        Country = country;
        Transport = transport;
        Region = region;
        Hotel = hotel;
        Stars = stars;
        Food = food;
        this.startCity = startCity;
        Nights = nights;
        Price = price;
        this.startDate = startDate;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getTransport() {
        return Transport;
    }

    public void setTransport(String transport) {
        Transport = transport;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }

    public String getStars() {
        return Stars;
    }

    public void setStars(String stars) {
        Stars = stars;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getNights() {
        return Nights;
    }

    public void setNights(String nights) {
        Nights = nights;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "Country='" + Country + '\'' +
                ", Transport='" + Transport + '\'' +
                ", Region='" + Region + '\'' +
                ", Hotel='" + Hotel + '\'' +
                ", Stars='" + Stars + '\'' +
                ", Food='" + Food + '\'' +
                ", startCity='" + startCity + '\'' +
                ", Nights='" + Nights + '\'' +
                ", Price='" + Price + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}

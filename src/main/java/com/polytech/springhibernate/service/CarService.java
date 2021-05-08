package com.polytech.springhibernate.service;

import java.util.List;

import com.polytech.springhibernate.entities.Car;
 
public interface CarService {
 
    public void addCar(Car p);
    public List<Car> listCars();
    public List<Car> searchCar(Car car);


}
package com.polytech.springhibernate.dao;

import java.util.List;

import com.polytech.springhibernate.entities.Car;

public interface CarDAO {
 
    public void addCar(Car p);
    public List<Car> listCars();
    public List<Car> searchCars(Car car);
}
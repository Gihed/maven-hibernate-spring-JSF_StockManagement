package com.polytech.springhibernate.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.polytech.springhibernate.dao.CarDAO;
import com.polytech.springhibernate.entities.Car;

@Service
@ManagedBean(name="carService")
@SessionScoped
public class CarServiceImpl implements CarService {

	private CarDAO carDAO;
	 
    public void setCarDAO(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
 
    @Override
    @Transactional
    public void addCar(Car p) {
        this.carDAO.addCar(p);
    }
 
    @Override
    @Transactional
    public List<Car> listCars() {
        return this.carDAO.listCars();
    }

    @Override
    @Transactional
    public List<Car> searchCar(Car car) {
        return this.carDAO.searchCars(car);
    }

 
}

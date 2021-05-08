package com.polytech.springhibernate.bean;

import com.polytech.springhibernate.entities.Car;
import com.polytech.springhibernate.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean(name="carBean")
@SessionScoped
public class CarBean {
    CarService carService;

    public CarService getCarService() {
        return carService;
    }

    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    public void addCar(Car car) {
        carService.addCar(car);
    }
    public List<Car> listCars() {
        return carService.listCars();
    }
    public List<Car> searchCar(Car car) {
        return carService.searchCar(car);
    }
}

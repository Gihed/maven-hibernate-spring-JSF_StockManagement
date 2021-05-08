package com.polytech.springhibernate.dao;

import java.util.List;

import com.polytech.springhibernate.entities.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CarDAOImpl implements CarDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(CarDAOImpl.class);
	 
    private SessionFactory sessionFactory;
     
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
 
    @Override
    public void addCar(Car p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Car saved successfully, Car Details="+p);
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Car> listCars() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Car> carsList = session.createQuery("from Car").list();
        for(Car p : carsList){
            logger.info("Car List::"+p);
        }
        return carsList;
    }

    @Override
    public List<Car> searchCars(Car car) {
        Session session = this.sessionFactory.getCurrentSession();
        String carName = car.getName();
        List<Car> carsList = session.createQuery("from Car as car where  car.name like ?").
                setParameter(0,car.getName()).list();
        for(Car p : carsList){
            logger.info("Car List::"+p);
        }
        return carsList;
    }

}

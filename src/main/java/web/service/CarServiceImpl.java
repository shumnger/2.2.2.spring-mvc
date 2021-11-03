package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List <Car> getCarsByCount(Integer count) {
        return carDao.getCarsByCount(count);
    }

    @Override
    public List <Car> getAllCars() {
        return carDao.getAllCars();
    }
}


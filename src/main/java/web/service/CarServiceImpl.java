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
    public List<Car> getCarsByCount(Integer count) {
        List<Car> allCars = carDao.getAllCars();
        if (count == null || count > allCars.size()) {
            return allCars;
        } else {
            return allCars.subList(0, count);
        }
    }
}

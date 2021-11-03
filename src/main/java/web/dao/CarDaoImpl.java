package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("BMW", "i8", 2010));
        allCars.add(new Car("Hyundai", "Sonata", 2012));
        allCars.add(new Car("UAZ", "Patriot", 1985));
        allCars.add(new Car("Mercedez", "CLK", 2007));
        allCars.add(new Car("Lada", "VESTA", 2019));
        return allCars;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        List<Car> allCars = getAllCars();
        if (count > allCars.size() || count < 0) {
            return allCars;
        } else {
            return allCars.subList(0, count);
        }
    }
}

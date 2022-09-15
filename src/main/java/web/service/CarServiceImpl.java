package web.service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW 1", 7000, "good"));
        cars.add(new Car("BMW 2", 9000, "good"));
        cars.add(new Car("BMW 3", 11000, "very"));
        cars.add(new Car("BMW 4", 17000, "very good"));
        cars.add(new Car("BMW 5", 27000, "good"));
    }


    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    @Override
    public List<Car> listCars() {
        return cars;
    }

}


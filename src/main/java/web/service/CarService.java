package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList(List<Car> list, int number);
    List<Car> getCarList(List<Car> list);
}

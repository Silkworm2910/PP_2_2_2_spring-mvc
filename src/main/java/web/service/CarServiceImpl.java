package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList(List<Car> list, int count) {

        return list
                .stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarList(List<Car> list) {
        return list;
    }
}

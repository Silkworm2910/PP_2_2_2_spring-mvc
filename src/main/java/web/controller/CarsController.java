package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count", required = false) Integer n,
                          Model model) {
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> cars;
        if (n == null) {
            cars = carService.getCarList(Car.createList());
        } else {
            cars = carService.getCarList(Car.createList(), n);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}

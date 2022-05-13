package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count", required = false, defaultValue = "5") int count,
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

package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(ModelMap car,
                            @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new CarServiceImpl().listCars();
        if (count != null && count < 5) {
            cars = cars.subList(0, count);
        }
        car.addAttribute("cars", cars);
        return "cars";
    }
}

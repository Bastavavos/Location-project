package edu.campusnum.location.vehicule.web.controller;

import edu.campusnum.location.vehicule.dao.CarDao;
import edu.campusnum.location.vehicule.model.Car;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class CarController {

    @Autowired

    private CarDao carDao;

    @RequestMapping(value = "/cars", method = RequestMethod.GET)

    public List<Car> listCars() { return carDao.findAll(); }

    @ApiOperation(value = "Récupère un vehicule par son id")

    @GetMapping(value = "/car/{id}")
    public Car showCar(@PathVariable int id) {
        return carDao.findById(id).orElse(null);
    }


}

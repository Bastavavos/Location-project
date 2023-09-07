package edu.campusnum.location.reservation.web.controller;

import edu.campusnum.location.reservation.dao.ResDao;
import edu.campusnum.location.reservation.model.Car;
import edu.campusnum.location.reservation.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class ResController {
    @Autowired
    private ResDao resDao;
    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/reservations", method = RequestMethod.GET)

    public List<Reservation> listCars() {
        return resDao.findAll();
    }

    @GetMapping("/res/{id}")
    public Reservation showRes(@PathVariable int id) {
        return resDao.findById(id);
    }

    @PostMapping("/res")
    public void addRes(@RequestBody Reservation reservation) {
        resDao.save(reservation);
    }

    @PutMapping("/res/{id}")
    public void updateRes(@PathVariable int id, @RequestBody Reservation reservation) {
        reservation.setId(id);
        resDao.save(reservation);
    }

    @DeleteMapping("/{id}")
    public Reservation deleteRes(@PathVariable int id) {
        return resDao.deleteById(id);
    }

    @GetMapping("/res/price/{kmestimated}/{id}")
    public double calculatePrice(@PathVariable int kmestimated, @PathVariable int id) {
        Car car = restTemplate.getForObject("http://localhost:9090/car/" + id , Car.class );
        double totalPrice = car.getPrice() + car.getKmrate() * kmestimated;
        return totalPrice;
    }
}




//    public carAge () {
//        Customer
//    }





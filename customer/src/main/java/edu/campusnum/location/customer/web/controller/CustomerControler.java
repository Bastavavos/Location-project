package edu.campusnum.location.customer.web.controller;

import edu.campusnum.location.customer.dao.CustomerDao;
import edu.campusnum.location.customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/customer")
public class CustomerControler {
    @Autowired
    private final CustomerDao customerDao;

    public CustomerControler(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    @GetMapping
    public ArrayList<Customer> listeCustomer() {
        return customerDao.findAll();
    }

    @GetMapping("/{id}")
    public Customer showCustomer(@PathVariable int id) {
        return customerDao.findById(id);
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        customerDao.save(customer);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCustom (@PathVariable int id) {
        customerDao.deleteById(id);
    }


//    public void isZihark(String permis){
//        Boolean ronku = restTemplate.getForObject("http://localhost:8081/permits/" + permis, Boolean.class);
//        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Bonjour ça marche pas");
//    }
}

package edu.campusnum.location.customer.dao;

import edu.campusnum.location.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
    ArrayList<Customer> findAll();
    Customer findById(int id);
    Customer save(Customer customer);
    //
    Customer deleteById(int id);
}

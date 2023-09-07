package edu.campusnum.location.reservation.dao;
import edu.campusnum.location.reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResDao extends JpaRepository<Reservation, Integer>{
    List<Reservation> findAll();
    Reservation findById(int id);
    Reservation deleteById(int id);

}

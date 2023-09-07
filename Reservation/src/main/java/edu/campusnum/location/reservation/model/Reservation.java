package edu.campusnum.location.reservation.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int idCustomer;
    private int idCar;
    private int kmestimated;
    Date startDate;
    Date endDate;


    public Reservation() {
    }

    public Reservation(int id, int idCustomer, int idCar, int kmestimated, Date startDate, Date endDate) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.idCar = idCar;
        this.kmestimated = kmestimated;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getKmestimated() {
        return kmestimated;
    }

    public void setKmestimated(int kmestimated) {
        this.kmestimated = kmestimated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", idCustomer=" + idCustomer +
                ", idCar=" + idCar +
                ", kmestimated=" + kmestimated +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

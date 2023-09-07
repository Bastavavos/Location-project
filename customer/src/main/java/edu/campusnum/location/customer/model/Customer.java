package edu.campusnum.location.customer.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    private String firstname;
    private String permis;
    private Date birthdate;

//    public Customer(int id, String name, int price) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }


    public Customer() {

    }

    public Customer(int id, String name, String firstname, String permis, Date birthdate) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.permis = permis;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", permis='" + permis + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }



}

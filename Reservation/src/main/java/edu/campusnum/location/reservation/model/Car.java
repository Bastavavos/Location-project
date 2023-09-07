package edu.campusnum.location.reservation.model;

public class Car {
    private int id;
    private String name;
    private String brand;
    private String model;
    private String color;
    private int price;
    private int taxhpower;
    private double kmrate;

    public Car() {
    }

    public Car(int id, String name, String brand, String model, String color, int price, int taxhpower, int kmrate) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.taxhpower = taxhpower;
        this.kmrate = kmrate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTaxhpower() {
        return taxhpower;
    }

    public void setTaxhpower(int taxhpower) {
        this.taxhpower = taxhpower;
    }

    public double getKmrate() {
        return kmrate;
    }

    public void setKmrate(double kmrate) {
        this.kmrate = kmrate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", taxhpower=" + taxhpower +
                ", kmrate=" + kmrate +
                '}';
    }
}

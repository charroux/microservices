package com.charroux.carRental.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Car {

    String plateNumber;
    int price;
    String brand;
    String photo;
    int horsepower;
    Collection<RentalAgreement> rentalAgreements = new ArrayList<RentalAgreement>();
    long id;

    public Car(String plateNumber, int price, String brand, String img, int horsepower) {
        this.plateNumber = plateNumber;
        this.price = price;
        this.brand = brand;
        this.photo = img;
        this.horsepower = horsepower;
    }

    public Car() {
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void addRentalAgreement(RentalAgreement rentalAgreement){
        rentalAgreements.add(rentalAgreement);
        rentalAgreement.setCar(this);
    }

    @OneToMany(cascade=CascadeType.ALL, mappedBy="car")
    public Collection<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }

    public void setRentalAgreements(Collection<RentalAgreement> rentalAgreements) {
        this.rentalAgreements = rentalAgreements;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + plateNumber + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", photo='" + photo + '\'' +
                ", horsepower=" + horsepower +
                ", rentalAgreements=" + rentalAgreements +
                ", id=" + id +
                '}';
    }
}

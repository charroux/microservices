package com.charroux.carRental.service;

import com.charroux.carRental.data.Car;

public interface AgreementService {

    public Iterable<Car> getCars();
    public Car findByPlateNumber(String plateNumber) throws CarNotFoundException;
    public void rent(String plateNumber, String firstName, String lastName, String email, String beginDate, String endDate) throws CarNotFoundException;

}

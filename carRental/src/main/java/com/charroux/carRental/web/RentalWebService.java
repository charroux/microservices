package com.charroux.carRental.web;

import com.charroux.carRental.data.Car;
import com.charroux.carRental.service.AgreementService;
import com.charroux.carRental.service.CarNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RentalWebService {

    @Value("${imageDirectory}")
    private String imageDirectory;

    List<Car> cars = new ArrayList<Car>();

    Logger logger = LoggerFactory.getLogger(RentalWebService.class);

    AgreementService agreementService;

    @Autowired
    public RentalWebService(AgreementService agreementService){
        this.agreementService = agreementService;
    }

    @GetMapping("/cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public Iterable<Car> getCars(){
        return agreementService.getCars();
    }

    @GetMapping("/cars/{plateNumber}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Car getACar(@PathVariable("plateNumber") String plateNumber) throws CarNotFoundException {
        return agreementService.findByPlateNumber(plateNumber);
    }

    @GetMapping(value = "/images/{imageName}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<byte[]> downloadSvgImage(@PathVariable("imageName") String imageName) throws IOException {

        logger.info("Download image: " + imageName);

        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "image/svg+xml");

        Resource file = new ClassPathResource(imageDirectory + "/" + imageName);
        final InputStream in = file.getInputStream();

        return ResponseEntity.ok()
                .headers(header)
                .body(IOUtils.toByteArray(in));
    }

    @PostMapping(value = "/cars/{plateNumber}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void rentACar(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value="firstName", required = true)String firstName,
            @RequestParam(value="lastName", required = true)String lastName,
            @RequestParam(value="email", required = true)String email,
            @RequestParam(value="beginDate", required = true)String beginDate,
            @RequestParam(value="endDate", required = true)String endDate
    ) throws CarNotFoundException {

        logger.info("Rent :" + plateNumber + " " + firstName + " " + lastName + " " + email + " " + beginDate + " " + endDate);

        agreementService.rent(plateNumber, firstName, lastName, email, beginDate, endDate);
    }

    /*@PutMapping(value = "/cars/{plaque}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void rent(
            @PathVariable("plaque") String plateNumber,
            @RequestParam(value="rent", required = true)boolean rent
            ) throws CarNotFoundException {

        logger.info("Plate number: " + plateNumber);
        logger.info("Rent: " + rent);

        Car car = cars.stream().filter(aCar -> aCar.getPlateNumber().equals(plateNumber)).findFirst().orElse(null);
        if(car != null){

        } else {
            logger.error("Car not found: " + plateNumber);
            throw new CarNotFoundException(plateNumber);
        }

    }*/

}

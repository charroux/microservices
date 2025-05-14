package com.charroux.carRental;

import com.charroux.carRental.data.Car;
import com.charroux.carRental.data.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository carRepository) {
		return (args) -> {
			Car car = new Car("11AA22", 1000, "Ferrari", "http://localhost:8080/images/ferrari.svg", 500);
			carRepository.save(car);
			car = new Car("22BB33", 3000, "Porsche", "http://localhost:8080/images/porsche.svg", 600);
			carRepository.save(car);
		};
	};

}

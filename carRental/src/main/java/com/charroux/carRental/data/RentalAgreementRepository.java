package com.charroux.carRental.data;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RentalAgreementRepository extends CrudRepository<RentalAgreement, Long> {

    List<RentalAgreement> findByEmail(String email);

}
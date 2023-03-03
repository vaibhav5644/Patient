package com.citiustech.cthospital.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citiustech.cthospital.model.PatientDetails;

@Repository
public interface PatientDetailRepository extends CrudRepository<PatientDetails, Integer> {

}

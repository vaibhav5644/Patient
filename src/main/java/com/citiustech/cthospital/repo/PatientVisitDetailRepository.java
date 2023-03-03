package com.citiustech.cthospital.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citiustech.cthospital.model.PatientVisitDetails;

@Repository
public interface PatientVisitDetailRepository extends CrudRepository<PatientVisitDetails, Integer>{

	List<PatientVisitDetails> findAllBypPatientId(int patientId);

}

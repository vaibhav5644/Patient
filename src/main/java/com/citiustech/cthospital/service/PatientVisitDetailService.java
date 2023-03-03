package com.citiustech.cthospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.citiustech.cthospital.dto.PatientVisitDetailsDTO;

public interface PatientVisitDetailService {

	public PatientVisitDetailsDTO getPatientVisitDetailsByVisitId(int patientVisitId);

	public List<PatientVisitDetailsDTO> getPatientVisitDetailsByPatientId(int patientId);
	
	public PatientVisitDetailsDTO addNewPatientVisitDetails(PatientVisitDetailsDTO patientVisitDetailsDTO);

	public PatientVisitDetailsDTO updatePatientVisitDetails(PatientVisitDetailsDTO patientVisitDetailsDTO, int pVisitId);

}

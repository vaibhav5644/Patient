package com.citiustech.cthospital.service;

import java.util.List;

import com.citiustech.cthospital.dto.PatientDetailsDTO;


public interface PatientDetailService {

	public List<PatientDetailsDTO> getAllPatients();
	
	public PatientDetailsDTO getPatientById(int patientId);

	public PatientDetailsDTO addNewPatient(PatientDetailsDTO patientDetailsDTO);
	
	public PatientDetailsDTO updatePatient(PatientDetailsDTO patientDetailsDTO, int pid);
	
}

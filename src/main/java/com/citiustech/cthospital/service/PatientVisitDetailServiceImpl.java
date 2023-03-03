package com.citiustech.cthospital.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citiustech.cthospital.dto.PatientVisitDetailsDTO;
import com.citiustech.cthospital.model.PatientVisitDetails;
import com.citiustech.cthospital.repo.PatientVisitDetailRepository;
@Service
public class PatientVisitDetailServiceImpl implements PatientVisitDetailService {

	@Autowired
	private PatientVisitDetailRepository patientVisitDetailRepository;

	@Override
	public PatientVisitDetailsDTO getPatientVisitDetailsByVisitId(int patientVisitId) {
		PatientVisitDetails patientVisitDetails = patientVisitDetailRepository.findById(patientVisitId).get();

		PatientVisitDetailsDTO patientVisitDetailsDTO = new PatientVisitDetailsDTO();
		patientVisitDetailsDTO.setPPatientVisitId(patientVisitDetails.getPPatientVisitId());
		patientVisitDetailsDTO.setPPatientId(patientVisitDetails.getPPatientId());
		patientVisitDetailsDTO.setPHeight(patientVisitDetails.getPHeight());
		patientVisitDetailsDTO.setPWeight(patientVisitDetails.getPWeight());
		patientVisitDetailsDTO.setPBloodPressure(patientVisitDetails.getPBloodPressure());
		patientVisitDetailsDTO.setPBodyTemperature(patientVisitDetails.getPBodyTemperature());
		patientVisitDetailsDTO.setPRespirationRate(patientVisitDetails.getPRespirationRate());
		patientVisitDetailsDTO.setDiagnosis(patientVisitDetails.getDiagnosis());
		patientVisitDetailsDTO.setProcedures(patientVisitDetails.getProcedures());
		patientVisitDetailsDTO.setMedication(patientVisitDetails.getMedication());
		patientVisitDetailsDTO.setVisitDate(patientVisitDetails.getVisitDate());
		return patientVisitDetailsDTO;
	}

	@Override
	public List<PatientVisitDetailsDTO> getPatientVisitDetailsByPatientId(int patientId) {

		List<PatientVisitDetails> patientVisitDetailslist = patientVisitDetailRepository.findAllBypPatientId(patientId);

		PatientVisitDetailsDTO patientVisitDetailsDTO = null;
		List<PatientVisitDetailsDTO> visitdetailslist = new ArrayList<PatientVisitDetailsDTO>();
		
		for (PatientVisitDetails patientVisitDetails : patientVisitDetailslist) {

			patientVisitDetailsDTO = new PatientVisitDetailsDTO();

			patientVisitDetailsDTO.setPPatientVisitId(patientVisitDetails.getPPatientVisitId());
			patientVisitDetailsDTO.setPPatientId(patientVisitDetails.getPPatientId());
			patientVisitDetailsDTO.setPHeight(patientVisitDetails.getPHeight());
			patientVisitDetailsDTO.setPWeight(patientVisitDetails.getPWeight());
			patientVisitDetailsDTO.setPBloodPressure(patientVisitDetails.getPBloodPressure());
			patientVisitDetailsDTO.setPBodyTemperature(patientVisitDetails.getPBodyTemperature());
			patientVisitDetailsDTO.setPRespirationRate(patientVisitDetails.getPRespirationRate());
			patientVisitDetailsDTO.setDiagnosis(patientVisitDetails.getDiagnosis());
			patientVisitDetailsDTO.setProcedures(patientVisitDetails.getProcedures());
			patientVisitDetailsDTO.setMedication(patientVisitDetails.getMedication());
			patientVisitDetailsDTO.setVisitDate(patientVisitDetails.getVisitDate());
			visitdetailslist.add(patientVisitDetailsDTO);
		}
		return visitdetailslist;
	}

	@Override
	public PatientVisitDetailsDTO addNewPatientVisitDetails(PatientVisitDetailsDTO patientVisitDetailsDTO) {
		PatientVisitDetails patientVisitDetails = new PatientVisitDetails();
		
		patientVisitDetails.setPPatientId(patientVisitDetailsDTO.getPPatientId());
		patientVisitDetails.setPHeight(patientVisitDetailsDTO.getPHeight());
		patientVisitDetails.setPWeight(patientVisitDetailsDTO.getPWeight());
		patientVisitDetails.setPBloodPressure(patientVisitDetailsDTO.getPBloodPressure());
		patientVisitDetails.setPBodyTemperature(patientVisitDetailsDTO.getPBodyTemperature());
		patientVisitDetails.setPRespirationRate(patientVisitDetailsDTO.getPRespirationRate());
		patientVisitDetails.setDiagnosis(patientVisitDetailsDTO.getDiagnosis());
		patientVisitDetails.setProcedures(patientVisitDetailsDTO.getProcedures());
		patientVisitDetails.setMedication(patientVisitDetailsDTO.getMedication());
		LocalDate date = LocalDate.now();
		patientVisitDetails.setVisitDate(date);
		patientVisitDetailRepository.save(patientVisitDetails);
		
		PatientVisitDetailsDTO patientVisitDetailsDTO2 = new PatientVisitDetailsDTO();

		patientVisitDetailsDTO2.setPPatientVisitId(patientVisitDetails.getPPatientVisitId());
		patientVisitDetailsDTO2.setPPatientId(patientVisitDetails.getPPatientId());
		patientVisitDetailsDTO2.setPHeight(patientVisitDetails.getPHeight());
		patientVisitDetailsDTO2.setPWeight(patientVisitDetails.getPWeight());
		patientVisitDetailsDTO2.setPBloodPressure(patientVisitDetails.getPBloodPressure());
		patientVisitDetailsDTO2.setPBodyTemperature(patientVisitDetails.getPBodyTemperature());
		patientVisitDetailsDTO2.setPRespirationRate(patientVisitDetails.getPRespirationRate());
		patientVisitDetailsDTO2.setDiagnosis(patientVisitDetails.getDiagnosis());
		patientVisitDetailsDTO2.setProcedures(patientVisitDetails.getProcedures());
		patientVisitDetailsDTO2.setMedication(patientVisitDetails.getMedication());
		patientVisitDetailsDTO2.setVisitDate(patientVisitDetails.getVisitDate());
		return patientVisitDetailsDTO2;
	}

	@Override
	public PatientVisitDetailsDTO updatePatientVisitDetails(PatientVisitDetailsDTO patientVisitDetailsDTO,
			int pVisitId) {
		
		PatientVisitDetails patientVisitDetails=patientVisitDetailRepository.findById(pVisitId).get();
		
		patientVisitDetails.setPPatientVisitId(patientVisitDetailsDTO.getPPatientVisitId());
		patientVisitDetails.setPPatientId(patientVisitDetailsDTO.getPPatientId());
		patientVisitDetails.setPHeight(patientVisitDetailsDTO.getPHeight());
		patientVisitDetails.setPWeight(patientVisitDetailsDTO.getPWeight());
		patientVisitDetails.setPBloodPressure(patientVisitDetailsDTO.getPBloodPressure());
		patientVisitDetails.setPBodyTemperature(patientVisitDetailsDTO.getPBodyTemperature());
		patientVisitDetails.setPRespirationRate(patientVisitDetailsDTO.getPRespirationRate());
		patientVisitDetails.setDiagnosis(patientVisitDetailsDTO.getDiagnosis());
		patientVisitDetails.setProcedures(patientVisitDetailsDTO.getProcedures());
		patientVisitDetails.setMedication(patientVisitDetailsDTO.getMedication());
		patientVisitDetails.setVisitDate(patientVisitDetailsDTO.getVisitDate());
		patientVisitDetailRepository.save(patientVisitDetails);
		
		PatientVisitDetailsDTO patientVisitDetailsDTO2 = new PatientVisitDetailsDTO();

		patientVisitDetailsDTO2.setPPatientVisitId(patientVisitDetails.getPPatientVisitId());
		patientVisitDetailsDTO2.setPPatientId(patientVisitDetails.getPPatientId());
		patientVisitDetailsDTO2.setPHeight(patientVisitDetails.getPHeight());
		patientVisitDetailsDTO2.setPWeight(patientVisitDetails.getPWeight());
		patientVisitDetailsDTO2.setPBloodPressure(patientVisitDetails.getPBloodPressure());
		patientVisitDetailsDTO2.setPBodyTemperature(patientVisitDetails.getPBodyTemperature());
		patientVisitDetailsDTO2.setPRespirationRate(patientVisitDetails.getPRespirationRate());
		patientVisitDetailsDTO2.setDiagnosis(patientVisitDetails.getDiagnosis());
		patientVisitDetailsDTO2.setProcedures(patientVisitDetails.getProcedures());
		patientVisitDetailsDTO2.setMedication(patientVisitDetails.getMedication());
		patientVisitDetailsDTO2.setVisitDate(patientVisitDetails.getVisitDate());
		return patientVisitDetailsDTO2;
	}

}

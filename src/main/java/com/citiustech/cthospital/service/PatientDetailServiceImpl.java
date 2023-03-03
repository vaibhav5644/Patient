package com.citiustech.cthospital.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.citiustech.cthospital.dto.PatientDetailsDTO;
import com.citiustech.cthospital.model.PatientDetails;
import com.citiustech.cthospital.repo.PatientDetailRepository;

@Service
public class PatientDetailServiceImpl implements PatientDetailService {

	@Autowired
	private PatientDetailRepository patientDetailRepository;

	@Override
	public List<PatientDetailsDTO> getAllPatients() {
		Iterable<PatientDetails> patients = patientDetailRepository.findAll();
		List<PatientDetailsDTO> patientsDTOList = new ArrayList<PatientDetailsDTO>();
		for (PatientDetails p : patients) {
			PatientDetailsDTO patientDetailsDTO = new PatientDetailsDTO();
			patientDetailsDTO.setPTitle(p.getPTitle());
			patientDetailsDTO.setPPatientId(p.getPPatientId());
			patientDetailsDTO.setPFirstName(p.getPFirstName());
			patientDetailsDTO.setPLastName(p.getPLastName());
			patientDetailsDTO.setPDateofBirth(p.getPDateofBirth());
			patientDetailsDTO.setPAge(p.getPAge());
			patientDetailsDTO.setPGender(p.getPGender());
			patientDetailsDTO.setPRace(p.getPRace());
			patientDetailsDTO.setPEthnicity(p.getPEthnicity());
			patientDetailsDTO.setPLanguagesKnown(p.getPLanguagesKnown());
			patientDetailsDTO.setPEmail(p.getPEmail());
			patientDetailsDTO.setPHomeAddress(p.getPHomeAddress());
			patientDetailsDTO.setPContactNumber(p.getPContactNumber());
			patientDetailsDTO.setEmergencyContactInfo(p.getEmergencyContactInfo());
			patientDetailsDTO.setAllergy(p.getAllergy());
			patientsDTOList.add(patientDetailsDTO);
		}
		return patientsDTOList;
	}

	@Override
	public PatientDetailsDTO getPatientById(int patientId) {
		PatientDetails patient = patientDetailRepository.findById(patientId).get();
		PatientDetailsDTO patientDetailsDTO = new PatientDetailsDTO();
		patientDetailsDTO.setPTitle(patient.getPTitle());
		patientDetailsDTO.setPPatientId(patient.getPPatientId());
		patientDetailsDTO.setPFirstName(patient.getPFirstName());
		patientDetailsDTO.setPLastName(patient.getPLastName());
		patientDetailsDTO.setPDateofBirth(patient.getPDateofBirth());
		patientDetailsDTO.setPAge(patient.getPAge());
		patientDetailsDTO.setPGender(patient.getPGender());
		patientDetailsDTO.setPRace(patient.getPRace());
		patientDetailsDTO.setPEthnicity(patient.getPEthnicity());
		patientDetailsDTO.setPLanguagesKnown(patient.getPLanguagesKnown());
		patientDetailsDTO.setPEmail(patient.getPEmail());
		patientDetailsDTO.setPHomeAddress(patient.getPHomeAddress());
		patientDetailsDTO.setPContactNumber(patient.getPContactNumber());
		patientDetailsDTO.setEmergencyContactInfo(patient.getEmergencyContactInfo());
		patientDetailsDTO.setAllergy(patient.getAllergy());
		return patientDetailsDTO;
	}

	@Override
	public PatientDetailsDTO addNewPatient(PatientDetailsDTO patientDetailsDTO) {

		PatientDetails patientDetails = new PatientDetails();
		patientDetails.setPTitle(patientDetailsDTO.getPTitle());
		patientDetails.setPPatientId(patientDetailsDTO.getPPatientId());
		patientDetails.setPFirstName(patientDetailsDTO.getPFirstName());
		patientDetails.setPLastName(patientDetailsDTO.getPLastName());
		patientDetails.setPDateofBirth(patientDetailsDTO.getPDateofBirth());
		patientDetails.setPAge(patientDetailsDTO.getPAge());
		patientDetails.setPGender(patientDetailsDTO.getPGender());
		patientDetails.setPRace(patientDetailsDTO.getPRace());
		patientDetails.setPEthnicity(patientDetailsDTO.getPEthnicity());
		patientDetails.setPLanguagesKnown(patientDetailsDTO.getPLanguagesKnown());
		patientDetails.setPEmail(patientDetailsDTO.getPEmail());
		patientDetails.setPHomeAddress(patientDetailsDTO.getPHomeAddress());
		patientDetails.setPContactNumber(patientDetailsDTO.getPContactNumber());
		patientDetails.setEmergencyContactInfo(patientDetailsDTO.getEmergencyContactInfo());
		patientDetails.setAllergy(patientDetailsDTO.getAllergy());

		PatientDetails patientDetails2 = patientDetailRepository.save(patientDetails);
System.out.println(patientDetails2);
		PatientDetailsDTO patientDetailsDTO2 = new PatientDetailsDTO();
		patientDetailsDTO2.setPTitle(patientDetails2.getPTitle());
		patientDetailsDTO2.setPPatientId(patientDetails2.getPPatientId());
		patientDetailsDTO2.setPFirstName(patientDetails2.getPFirstName());
		patientDetailsDTO2.setPLastName(patientDetails2.getPLastName());
		patientDetailsDTO2.setPDateofBirth(patientDetails2.getPDateofBirth());
		patientDetailsDTO2.setPAge(patientDetails2.getPAge());
		patientDetailsDTO2.setPGender(patientDetails2.getPGender());
		patientDetailsDTO2.setPRace(patientDetails2.getPRace());
		patientDetailsDTO2.setPEthnicity(patientDetails2.getPEthnicity());
		patientDetailsDTO2.setPLanguagesKnown(patientDetails2.getPLanguagesKnown());
		patientDetailsDTO2.setPEmail(patientDetails2.getPEmail());
		patientDetailsDTO2.setPHomeAddress(patientDetails2.getPHomeAddress());
		patientDetailsDTO2.setPContactNumber(patientDetails2.getPContactNumber());
		patientDetailsDTO2.setEmergencyContactInfo(patientDetails2.getEmergencyContactInfo());
		patientDetailsDTO2.setAllergy(patientDetails2.getAllergy());

		return patientDetailsDTO2;
	}

	@Override
	public PatientDetailsDTO updatePatient(PatientDetailsDTO patientDetailsDTO, int pid) {

		PatientDetails patientDetails = patientDetailRepository.findById(pid).get();

		PatientDetailsDTO patientDetailsDTO2 = null;

		if (patientDetailsDTO != null) {
			patientDetails.setPPatientId(patientDetailsDTO.getPPatientId());
			patientDetails.setPTitle(patientDetailsDTO.getPTitle());
			patientDetails.setPFirstName(patientDetailsDTO.getPFirstName());
			patientDetails.setPLastName(patientDetailsDTO.getPLastName());
			patientDetails.setPDateofBirth(patientDetailsDTO.getPDateofBirth());
			patientDetails.setPAge(patientDetailsDTO.getPAge());
			patientDetails.setPGender(patientDetailsDTO.getPGender());
			patientDetails.setPRace(patientDetailsDTO.getPRace());
			patientDetails.setPEthnicity(patientDetailsDTO.getPEthnicity());
			patientDetails.setPLanguagesKnown(patientDetailsDTO.getPLanguagesKnown());
			patientDetails.setPEmail(patientDetailsDTO.getPEmail());
			patientDetails.setPHomeAddress(patientDetailsDTO.getPHomeAddress());
			patientDetails.setPContactNumber(patientDetailsDTO.getPContactNumber());
			patientDetails.setEmergencyContactInfo(patientDetailsDTO.getEmergencyContactInfo());
			patientDetails.setAllergy(patientDetailsDTO.getAllergy());

			PatientDetails patientDetails2 = patientDetailRepository.save(patientDetails);

			patientDetailsDTO2 = new PatientDetailsDTO();
			patientDetailsDTO2.setPPatientId(patientDetails2.getPPatientId());
			patientDetailsDTO2.setPTitle(patientDetails2.getPTitle());
			patientDetailsDTO2.setPFirstName(patientDetails2.getPFirstName());
			patientDetailsDTO2.setPLastName(patientDetails2.getPLastName());
			patientDetailsDTO2.setPDateofBirth(patientDetails2.getPDateofBirth());
			patientDetailsDTO2.setPAge(patientDetails2.getPAge());
			patientDetailsDTO2.setPGender(patientDetails2.getPGender());
			patientDetailsDTO2.setPRace(patientDetails2.getPRace());
			patientDetailsDTO2.setPEthnicity(patientDetails2.getPEthnicity());
			patientDetailsDTO2.setPLanguagesKnown(patientDetails2.getPLanguagesKnown());
			patientDetailsDTO2.setPEmail(patientDetails2.getPEmail());
			patientDetailsDTO2.setPHomeAddress(patientDetails2.getPHomeAddress());
			patientDetailsDTO2.setPContactNumber(patientDetails2.getPContactNumber());
			patientDetailsDTO2.setEmergencyContactInfo(patientDetails2.getEmergencyContactInfo());
			patientDetailsDTO2.setAllergy(patientDetails2.getAllergy());
		}
		return patientDetailsDTO2;
	}

}

package com.citiustech.cthospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citiustech.cthospital.dto.PatientVisitDetailsDTO;
import com.citiustech.cthospital.service.PatientVisitDetailService;

@RestController
public class PatientVisitDetailsController {

	@Autowired
	private PatientVisitDetailService patientVisitDetailService;

	@GetMapping(value = "/visit/{vid}")
	public ResponseEntity<PatientVisitDetailsDTO> getPatientVisitDetailsByPatientVisitId(
			@PathVariable("vid") int visitId) {
		PatientVisitDetailsDTO patientVisitDetailsDTO = patientVisitDetailService
				.getPatientVisitDetailsByVisitId(visitId);
		return new ResponseEntity<PatientVisitDetailsDTO>(patientVisitDetailsDTO, HttpStatus.FOUND);
	}

	@GetMapping(value = "/pvisit/{pid}")
	public ResponseEntity<List<PatientVisitDetailsDTO>> getPatientVisitDetailsByPatientId(
			@PathVariable("pid") int pid) {
		List<PatientVisitDetailsDTO> patientVisitDetailsDTO = patientVisitDetailService
				.getPatientVisitDetailsByPatientId(pid);
		return new ResponseEntity<List<PatientVisitDetailsDTO>>(patientVisitDetailsDTO, HttpStatus.FOUND);
	}

	@PostMapping(value = "/visit")
	public ResponseEntity<PatientVisitDetailsDTO> addNewPatientVisitDetails(
			@RequestBody PatientVisitDetailsDTO patientVisitDetailsDTO) {
		PatientVisitDetailsDTO patientVisitDetailsDTO2 = patientVisitDetailService
				.addNewPatientVisitDetails(patientVisitDetailsDTO);
		return new ResponseEntity<PatientVisitDetailsDTO>(patientVisitDetailsDTO2, HttpStatus.CREATED);
	}

	@PutMapping(value = "/visit/{vid}")
	public ResponseEntity<PatientVisitDetailsDTO> updatePatientVisitDetails(@PathVariable("vid") int visitid,
			@RequestBody PatientVisitDetailsDTO patientVisitDetailsDTO) {
		PatientVisitDetailsDTO patientVisitDetailsDTO2 = patientVisitDetailService.updatePatientVisitDetails(patientVisitDetailsDTO, visitid);
		return new ResponseEntity<PatientVisitDetailsDTO>(patientVisitDetailsDTO2, HttpStatus.FOUND);
	}
}

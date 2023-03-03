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

import com.citiustech.cthospital.dto.PatientDetailsDTO;
import com.citiustech.cthospital.service.PatientDetailService;

@RestController
public class PatientDetailController {

	@Autowired
	private PatientDetailService patientDetailService;
	
	@GetMapping(value = "/patient")
	public ResponseEntity<List<PatientDetailsDTO>> getAllPatients(){
		List<PatientDetailsDTO> plist=patientDetailService.getAllPatients();
		return new ResponseEntity<List<PatientDetailsDTO>>(plist, HttpStatus.OK);	
	}
	
	@GetMapping(value="/patient/{id}")
	public ResponseEntity<PatientDetailsDTO> getPatientById(@PathVariable("id") int patientId){
		PatientDetailsDTO patient = patientDetailService.getPatientById(patientId);
		return new ResponseEntity<PatientDetailsDTO>(patient, HttpStatus.OK);
	}
	
	@PostMapping(value = "/patient")
	public ResponseEntity<PatientDetailsDTO> addNewPatient(@RequestBody PatientDetailsDTO patientDetailsDTO){
		PatientDetailsDTO patientDetailsDTO2=patientDetailService.addNewPatient(patientDetailsDTO);
		return new ResponseEntity<PatientDetailsDTO>(patientDetailsDTO2, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/patient/{id}")
	public ResponseEntity<PatientDetailsDTO> updatePatient(@RequestBody PatientDetailsDTO patientDetailsDTO, @PathVariable("id") int pid){
		PatientDetailsDTO patientDetailsDTO2=patientDetailService.updatePatient(patientDetailsDTO,pid);
		return new ResponseEntity<PatientDetailsDTO>(patientDetailsDTO2, HttpStatus.CREATED);
	}
}

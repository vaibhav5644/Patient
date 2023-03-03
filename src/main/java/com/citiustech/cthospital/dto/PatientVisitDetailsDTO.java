package com.citiustech.cthospital.dto;

import java.time.LocalDate;
import java.util.List;

import com.citiustech.cthospital.model.Diagnosis;
import com.citiustech.cthospital.model.Medication;
import com.citiustech.cthospital.model.Procedures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientVisitDetailsDTO {

	private int pPatientVisitId;
	private int pPatientId;
	private int pHeight;
	private int pWeight;
	private String pBloodPressure;
	private int pBodyTemperature;
	private int pRespirationRate;

	
	private List<Diagnosis> diagnosis;

	private List<Medication> medication;

	private List<Procedures> procedures;
	
	private LocalDate visitDate;
}

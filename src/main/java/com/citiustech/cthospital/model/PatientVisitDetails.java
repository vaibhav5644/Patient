package com.citiustech.cthospital.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientVisitDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pPatientVisitId;
	private int pPatientId;
	private int pHeight;
	private int pWeight;
	private String pBloodPressure;
	private int pBodyTemperature;
	private int pRespirationRate;
	
	@ManyToMany(targetEntity = Diagnosis.class , cascade = CascadeType.ALL)
	private List<Diagnosis> diagnosis;

	@ManyToMany(targetEntity = Medication.class , cascade = CascadeType.ALL)
	private List<Medication> medication;

	@ManyToMany(targetEntity = Procedures.class , cascade = CascadeType.ALL)
	private List<Procedures> procedures;
	
	private LocalDate visitDate;
}

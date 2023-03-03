package com.citiustech.cthospital.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Diagnosis {

	@Id
	private int diagnosisCode;
	private String diagnosisDescription;
	private boolean diagnosisIsDepricated;
	
	
}

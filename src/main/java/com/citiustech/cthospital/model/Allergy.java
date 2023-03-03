package com.citiustech.cthospital.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Allergy {

	@Id
	private String allergyId;
	private String allergyType;
	private String allergyName;
	private String allergyDescription;
	private String allergyClinicalInformation;
	private boolean isAllergyFatal;
	
}

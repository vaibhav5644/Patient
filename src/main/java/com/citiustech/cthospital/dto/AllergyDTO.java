package com.citiustech.cthospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllergyDTO {

	private String allergyId;
	private String allergyType;
	private String allergyName;
	private String allergyDescription;
	private String allergyClinicalInformation;
	private boolean isAllergyFatal;
	
}

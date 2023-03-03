package com.citiustech.cthospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicationDTO {

	private String drugId;
	private String drugName;
	private String drugGenericName;
	private String drugBrandName;
	private String drugForm; 

	
}

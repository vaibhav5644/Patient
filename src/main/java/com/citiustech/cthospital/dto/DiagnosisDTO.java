package com.citiustech.cthospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiagnosisDTO {

	private int diagnosisCode;
	private String diagnosisDescription;
	private boolean diagnosisIsDepricated;
	
}

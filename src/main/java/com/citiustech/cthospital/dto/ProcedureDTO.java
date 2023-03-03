package com.citiustech.cthospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcedureDTO {

	private int proceduresCode;  
	private String procedureDescription;
	private boolean procedureIsDepricated;
	
}

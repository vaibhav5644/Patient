package com.citiustech.cthospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmergencyContactInfoDTO {
	
	private int eId;
	private String eTitle;
	private String eFirstName;
	private String eLastName;
	private String eRelationship;
	private String eEmail;
	private String eHomeAddress;
	private Long eContactNumber;
	private boolean eportalAccess;
}

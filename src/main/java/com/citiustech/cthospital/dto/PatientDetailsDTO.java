package com.citiustech.cthospital.dto;

import java.time.LocalDate;
import java.util.List;

import com.citiustech.cthospital.model.Allergy;
import com.citiustech.cthospital.model.EmergencyContactInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDetailsDTO {

	private int pPatientId;
	private String pTitle;
	private String pFirstName;
	private String pLastName;
	private LocalDate pDateofBirth;
	private int pAge;
	private String pGender;  
	private String pRace; 
	private String pEthnicity; 
	private String pLanguagesKnown; 
	private String pEmail; 
	private String pHomeAddress; 
	private Long pContactNumber;
	
	private List<EmergencyContactInfo> emergencyContactInfo;

	private List<Allergy> allergy;

	
}

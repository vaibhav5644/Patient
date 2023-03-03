package com.citiustech.cthospital.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientDetails {

	@Id
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

	@OneToMany(targetEntity = EmergencyContactInfo.class, cascade = CascadeType.ALL)
	private List<EmergencyContactInfo> emergencyContactInfo;

	@ManyToMany(targetEntity = Allergy.class, cascade = CascadeType.ALL)
	private List<Allergy> allergy;

}

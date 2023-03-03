package com.citiustech.cthospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmergencyContactInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

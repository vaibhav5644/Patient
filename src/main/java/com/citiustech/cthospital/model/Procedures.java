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
public class Procedures {

	@Id
	private int proceduresCode;  
	private String procedureDescription;
	private boolean procedureIsDepricated;
	
}

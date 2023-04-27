package com.branch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class companymodel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long rollno;
	private String name;
	private String address;

}

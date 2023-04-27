package com.branch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.branch.dao.Companyrepository;
import com.branch.model.companymodel;





@Service
public class companyservice {

	@Autowired
	Companyrepository cr;
//	public List<company> getAllCompany;
//	getcompany(long rn){
//		optional<company>Comp = cr.findById(rn);
//		
//		if (Comp.isPresent()) {
//			return comp;
//		}
//	}else {
//		new Company();
//	}
//	return comp;
	
	
	

	public companymodel addCompany(companymodel comp) {
		System.out.println(comp.getName());
		return cr.save(comp);
	}

	public List<company> getAllCompany() {
		
		return (List<company>) cr.findAll();
	}

	public companymodel updateCompany(long rollno) {
	 
		return updateCompany(rollno);
	}

	public companymodel getCompany(long rn) {
		Optional<Company> comp = cr.findById(rn);
		return Company.
	}

	public String deleteCompany(long rollno) {
		return deleteCompany(rollno);
	}
}


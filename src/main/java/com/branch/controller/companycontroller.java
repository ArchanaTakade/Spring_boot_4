package com.branch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.branch.model.companymodel;
import com.branch.service.company;
import com.branch.service.companyservice;



@RestController
public class companycontroller {
	
	@Autowired
	companyservice cs;
	
	@GetMapping("/company")
	public companymodel getCompany(@RequestParam("rollno") long rn) {
		return cs.getCompany(rn);
	}
	
	
	@PostMapping("/comp")
	public companymodel addCompany(@RequestBody companymodel comp) {
		return cs.addCompany(comp);
	}
	
	@GetMapping("/companys")
	public List<company>getAllCompanys(){
		return cs.getCompany(ID);
	}

	@PutMapping("/company")
	public companymodel updateCompany(@RequestParam("rollno")long rollno,
			                          @RequestParam("name") String name){
		return cs.updateCompany(rollno, Company);
}

	@PutMapping("/update-company")
	public company updateCompany(@RequestBody company comp) {
		return cs.addCompany(company);
}

        @DeleteMapping("/company")
         public String deleteCompany(@RequestParam("rollno")long rollno) {
	     return cs.deleteCompany(rollno);
}


}

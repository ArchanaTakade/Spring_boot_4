package com.branch.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.branch.model.companymodel;

@Repository
public interface Companyrepository extends CrudRepository<companymodel, Long> {

}

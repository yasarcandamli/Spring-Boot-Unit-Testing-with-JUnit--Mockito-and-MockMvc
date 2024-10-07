package com.luv2code.springmvc.repository;

import com.luv2code.springmvc.models.CollegeStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface StudentDao extends CrudRepository<CollegeStudent, Integer> {

}

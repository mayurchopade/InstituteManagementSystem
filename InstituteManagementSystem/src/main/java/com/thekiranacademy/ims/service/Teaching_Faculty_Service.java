package com.thekiranacademy.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thekiranacademy.ims.dao.Teaching_Faculty_Dao;
import com.thekiranacademy.ims.entity.Teaching_Faculty;

@Service
public class Teaching_Faculty_Service {

	@Autowired
	private Teaching_Faculty_Dao td ;
	
	public List<Teaching_Faculty> getAllFaculty() {
		return td.getAllFaculty();
		
		
	}

	public String saveFacultyDetails(Teaching_Faculty faculty) {
		return td.saveFacultyDetails(faculty);
		
	}

	public String deleteFacultyDetails(Teaching_Faculty faculty) {
		return td.deleteFacultyDetails(faculty);
		
	}

	public String updateFacultyDetails(Teaching_Faculty faculty) {
		return td.updateFacultyDetails(faculty);
		
	}

	public List<Teaching_Faculty> maxSalary() {
		return td.maxSalary();
		
	}

	public List<Teaching_Faculty> minSalary() {
		return td.minSalary();
		
	}

	public List<Teaching_Faculty> getFacultyGT40kSalary() {
	
		return td.getFacultyGT40kSalary();
		
	}

	public List<Teaching_Faculty> getFacultyGT30kSalary() {
		return td.getFacultyGT30kSalary();		
	}
	
	public List<Teaching_Faculty> getFacultyGTSalary(Teaching_Faculty faculty) {

		return td.getFacultyGTSalary(faculty);
	}

	public List<Teaching_Faculty> getFacultybt30kAnd40kSalary() {
		return td.getFacultybt30kAnd40kSalary();
	}

	public List<Teaching_Faculty> getFacultybt40kAnd50kSalary() {
		return td.getFacultybt40kAnd50kSalary();	
	}

	public List<Teaching_Faculty> getFacultybt50kAnd60kSalary() {
		return td.getFacultybt50kAnd60kSalary();
	}

	public List<Teaching_Faculty> getFacultyLT40kSalary() {
		return td.getFacultyLT40kSalary();
		
	}

	public List<Teaching_Faculty> getFacultyLT30kSalary() {
		return td.getFacultyLT30kSalary();
	}

	public List<Teaching_Faculty> getFacultyGE30kSalary() {
		 return td.getFacultyGE30kSalary();
		
	}

	public List<Teaching_Faculty> getFacultyLE30kSalary() {
		return td.getFacultyLE30kSalary();
	}

	public List<Teaching_Faculty> getFacultyLikeName(Teaching_Faculty faculty) {
		return td.getFacultyLikeName(faculty);
	}

	public List<Teaching_Faculty> getFacultyById(Teaching_Faculty faculty) {
		return td.getFacultyById(faculty);
	}

	public List<Teaching_Faculty> getFacultyNEname(Teaching_Faculty faculty){
		return td.getFacultyNEname(faculty);
	}
	
	public List<Teaching_Faculty> getFacultyeqOrIsNull(Teaching_Faculty faculty){
		return td.getFacultyeqOrIsNull(faculty);
	}
	
	public List<Teaching_Faculty> getFacultyByDepartment(Teaching_Faculty faculty){
		return td.getFacultyByDepartment(faculty);
	}
}

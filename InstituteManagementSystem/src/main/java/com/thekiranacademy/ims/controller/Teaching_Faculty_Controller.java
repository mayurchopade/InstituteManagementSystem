package com.thekiranacademy.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thekiranacademy.ims.entity.Teaching_Faculty;
import com.thekiranacademy.ims.service.Teaching_Faculty_Service;

@RestController
@RequestMapping("faculty")
public class Teaching_Faculty_Controller {

	@Autowired// it is a annotation of spring
	private Teaching_Faculty_Service ts;// as it is a custome variable it should be private.
	
	/*
	 * here we create a object of Teaching_Faculty_  service but new keyword always create new
	 * heap memory, to avoid memory wastage springboot helps us to write @Autowired
	 * annotation as it will inject the object automaticlly.
	 */
	
	// it is called as dependencies injection.This module is called as IOC(
	// inversion of control) model.
	
	//1 get Teacher
	@GetMapping("all")
	public List<Teaching_Faculty> getAllFaculty() {
		return ts.getAllFaculty();
	}
	//2 insert teacher
	@PostMapping("save")
	public String saveFacultyDetails(@RequestBody Teaching_Faculty faculty) {
		 return ts.saveFacultyDetails(faculty);
		
	}
	
	// 3 (need to check)  delete data
	@DeleteMapping("delete")
	public String deleteFacultyDetails(@RequestBody Teaching_Faculty faculty) {
		 return ts.deleteFacultyDetails(faculty);
	}
	//4 update data
	@PutMapping("update")
	public String updateFacultyDetails(@RequestBody Teaching_Faculty faculty) {
		return ts.updateFacultyDetails(faculty);
	}
	
	// 5 maxsalary
	@GetMapping("maxsalary")
	public List<Teaching_Faculty> maxSalary() {
		return ts.maxSalary();
	}
	
	// 6 minsalary
	@GetMapping("minsalary")
	public List<Teaching_Faculty> minSalary() {
		
		return ts.minSalary();
	}
	
	//7   salary>40k
	@GetMapping("morethan40k")
	public List<Teaching_Faculty> getFacultyGT40kSalary() {
		return ts.getFacultyGT40kSalary();
	}
	//8 salary>30k
	@GetMapping("morethan30k")
	public List<Teaching_Faculty> getFacultyGT30kSalary() {
		return ts.getFacultyGT30kSalary();
	}
	
	//9
	@GetMapping("gtother")
	public List<Teaching_Faculty> getFacultyGTSalary(@RequestBody Teaching_Faculty faculty) {
			return ts.getFacultyGTSalary(faculty);
	}
	
	//10
	@GetMapping("between30kto40k")
	public List<Teaching_Faculty> getFacultybt30kAnd40kSalary() {
		return ts.getFacultybt30kAnd40kSalary();
	}
	
	//11
	@GetMapping("between40kto50k")
	public List<Teaching_Faculty> getFacultybt40kAnd50kSalary () {
		return ts.getFacultybt40kAnd50kSalary();
	}
	
	//12
	@GetMapping("between50kto60k")
	public List<Teaching_Faculty> getFacultybt50kAnd60kSalary() {
		return ts.getFacultybt50kAnd60kSalary();
	}
	
	//13
	@GetMapping("lessthan40k")
	public List<Teaching_Faculty> getFacultyLT40kSalary() {
		return ts.getFacultyLT40kSalary();
	}
	
	//14
	@GetMapping("lessthan30k")
	public List<Teaching_Faculty> getFacultyLT30kSalary() {
		return ts.getFacultyLT30kSalary();
	}
	
	//15
	@GetMapping("greterthaneqalto30k")
	public List<Teaching_Faculty> getFacultyGE30kSalary() {
		return ts.getFacultyGE30kSalary();
	}
	
	//16
	@GetMapping("lessthanequalto30k")
	public List<Teaching_Faculty> getFacultyLE30kSalary() {
		 return ts.getFacultyLE30kSalary();
	}
	
	//17
	@GetMapping("namelike")
	public List<Teaching_Faculty> getFacultyLikeName(@RequestBody Teaching_Faculty faculty) {
		return ts.getFacultyLikeName(faculty);
	}
	
	//18
	@GetMapping("show")
	public List<Teaching_Faculty> getFacultyById(@RequestBody Teaching_Faculty faculty) {
		return ts.getFacultyById(faculty);
	}
	
	//19
	@GetMapping("namenoteqal")
	public List<Teaching_Faculty> getFacultyNEname(@RequestBody Teaching_Faculty faculty) {
		return ts.getFacultyNEname(faculty);
	}
	
	//20
	@GetMapping("eqalornull")
	public List<Teaching_Faculty> getFacultyeqOrIsNull(@RequestBody Teaching_Faculty faculty) {
		return ts.getFacultyeqOrIsNull(faculty);
	}
	
	//21
	@GetMapping("department")
	public List<Teaching_Faculty> getFacultyByDepartment(@RequestBody Teaching_Faculty faculty){
		return ts.getFacultyByDepartment(faculty);
	}
	
}

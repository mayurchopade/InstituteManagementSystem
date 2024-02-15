package com.thekiranacademy.ims.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teaching_Faculty {

	private int faculty_Id;
	private String faculty_FirstName;
	private String faculty_LastName;
	private int faculty_Age;
	private double faculty_Salary;
	private String faculty_Qualification;
	private String faculty_Experience;
	private String faculty_Designation;
	private String faculty_Department;
	private String institute_Name;
	private String faculty_Contact;
	private String faculty_EmailId;
	private String faculty_Location;
	
	@Id
	public int getFaculty_Id() {
		return faculty_Id;
	}
	public void setFaculty_Id(int faculty_Id) {
		this.faculty_Id = faculty_Id;
	}
	public String getFaculty_FirstName() {
		return faculty_FirstName;
	}
	public void setFaculty_FirstName(String faculty_FirstName) {
		this.faculty_FirstName = faculty_FirstName;
	}
	public String getFaculty_LastName() {
		return faculty_LastName;
	}
	public void setFaculty_LastName(String faculty_LastName) {
		this.faculty_LastName = faculty_LastName;
	}
	public int getFaculty_Age() {
		return faculty_Age;
	}
	public void setFaculty_Age(int faculty_Age) {
		this.faculty_Age = faculty_Age;
	}
	public double getFaculty_Salary() {
		return faculty_Salary;
	}
	public void setFaculty_Salary(double faculty_Salary) {
		this.faculty_Salary = faculty_Salary;
	}
	public String getFaculty_Qualification() {
		return faculty_Qualification;
	}
	public void setFaculty_Qualification(String faculty_Qualification) {
		this.faculty_Qualification = faculty_Qualification;
	}
	public String getFaculty_Experience() {
		return faculty_Experience;
	}
	public void setFaculty_Experience(String faculty_Experience) {
		this.faculty_Experience = faculty_Experience;
	}
	public String getFaculty_Designation() {
		return faculty_Designation;
	}
	public void setFaculty_Designation(String faculty_Designation) {
		this.faculty_Designation = faculty_Designation;
	}
	public String getFaculty_Department() {
		return faculty_Department;
	}
	public void setFaculty_Department(String faculty_Department) {
		this.faculty_Department = faculty_Department;
	}
	public String getInstitute_Name() {
		return institute_Name;
	}
	public void setInstitute_Name(String institute_Name) {
		this.institute_Name = institute_Name;
	}
	public String getFaculty_Contact() {
		return faculty_Contact;
	}
	public void setFaculty_Contact(String faculty_Contact) {
		this.faculty_Contact = faculty_Contact;
	}
	public String getFaculty_EmailId() {
		return faculty_EmailId;
	}
	public void setFaculty_EmailId(String faculty_EmailId) {
		this.faculty_EmailId = faculty_EmailId;
	}
	public String getFaculty_Location() {
		return faculty_Location;
	}
	public void setFaculty_Location(String faculty_Location) {
		this.faculty_Location = faculty_Location;
	}
	@Override
	public String toString() {
		return "Teaching_Faculty [faculty_Id=" + faculty_Id + ", faculty_FirstName=" + faculty_FirstName
				+ ", faculty_LastName=" + faculty_LastName + ", faculty_Age=" + faculty_Age + ", faculty_Salary="
				+ faculty_Salary + ", faculty_Qualification=" + faculty_Qualification + ", faculty_Experience="
				+ faculty_Experience + ", faculty_Designation=" + faculty_Designation + ", faculty_Department="
				+ faculty_Department + ", institute_Name=" + institute_Name + ", faculty_Contact=" + faculty_Contact
				+ ", faculty_EmailId=" + faculty_EmailId + ", faculty_Location=" + faculty_Location + "]";
	}
	
	
	
	
}

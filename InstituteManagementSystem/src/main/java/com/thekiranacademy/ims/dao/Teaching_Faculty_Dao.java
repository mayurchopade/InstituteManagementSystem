package com.thekiranacademy.ims.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thekiranacademy.ims.entity.Teaching_Faculty;

@Repository
public class Teaching_Faculty_Dao {

	@Autowired
	private SessionFactory sf;
	
	
	// all Faculty
	public List<Teaching_Faculty> getAllFaculty() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		List<Teaching_Faculty> list =criteria.list();

		return list;
		
	}

	//save Faculty
	
	public String saveFacultyDetails(Teaching_Faculty faculty) {
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.save(faculty);
		tr.commit();
		
		return "Data Saved Sucessfully...";
		
	}

	//Delete Faculty
	public String deleteFacultyDetails(Teaching_Faculty faculty) {
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.delete(faculty);
		tr.commit();
		
		return "Data Deleted Sucessfully....";
	}
	
	// Update Faculty
	public String updateFacultyDetails(Teaching_Faculty faculty) {
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.update(faculty);
		tr.commit();
		
		return "Data Updated Sucessfully....";
		
	}

	//MAX Salary
	public List<Teaching_Faculty> maxSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.setProjection(Projections.max("faculty_Salary"));
		List<Teaching_Faculty> list = criteria.list();
		return list;
		
	}

	// MIN Salary
	public List<Teaching_Faculty> minSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.setProjection(Projections.min("faculty_Salary"));
		List<Teaching_Faculty> list = criteria.list();
		return list;
		
	}

	//Greater Than 40000 Salary
	public List<Teaching_Faculty> getFacultyGT40kSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.gt("faculty_Salary", 40000.0));
		List<Teaching_Faculty> list = criteria.list();
		return list;
	}

	//Greater Than 30000 Salary
	public List<Teaching_Faculty> getFacultyGT30kSalary() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.gt("faculty_Salary", 30000.0));
		List<Teaching_Faculty> list = criteria.list();
		return list;
		
	}
	
	//Greater Than input  Salary
	public List<Teaching_Faculty> getFacultyGTSalary(Teaching_Faculty faculty) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.gt("faculty_Salary", faculty.getFaculty_Salary()));
		List<Teaching_Faculty> list = criteria.list();
		return list;
	}

	// Between salary 30000 and 40000
	public List<Teaching_Faculty> getFacultybt30kAnd40kSalary() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.between("faculty_Salary", 30000.0, 40000.0));
		List<Teaching_Faculty> list = criteria.list();
		return list;
	}

	// between 40000 to 50000
	public List<Teaching_Faculty> getFacultybt40kAnd50kSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.between("faculty_Salary", 40000.0, 50000.0));
		List<Teaching_Faculty> list = criteria.list();
		return list;
	}

	//between 50000 to 60000
	public List<Teaching_Faculty> getFacultybt50kAnd60kSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.between("faculty_Salary", 50000.0, 60000.0));
		List<Teaching_Faculty> list = criteria.list();
		return list;
	}

	// Salary less than 40000
	public List<Teaching_Faculty> getFacultyLT40kSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.lt("faculty_Salary", 40000.0));
		List<Teaching_Faculty> list = criteria.list();
		return list;
	}

	//Salary less than 30000
	public List<Teaching_Faculty> getFacultyLT30kSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.lt("faculty_Salary", 30000.0));
		List<Teaching_Faculty> list = criteria.list();
		return list;
	}

	//Salary greater than 30000
	public List<Teaching_Faculty> getFacultyGE30kSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.ge("faculty_Salary", 30000.0));
		List<Teaching_Faculty> list =   criteria.list();
		return list;
	}

	//Salary less than 30000
	public List<Teaching_Faculty> getFacultyLE30kSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.le("faculty_Salary", 30000.0));
		List<Teaching_Faculty> list =   criteria.list();
		return list;
	}

	//Faculty First_name like Input
	public List<Teaching_Faculty> getFacultyLikeName(Teaching_Faculty faculty) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.like("faculty_FirstName", faculty.getFaculty_FirstName()));
		List<Teaching_Faculty> list =   criteria.list();
		return list;
		
	}

	// Faculty ID Eqals to Input 
	public List<Teaching_Faculty> getFacultyById(Teaching_Faculty  faculty) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.idEq(faculty.getFaculty_Id()));
		List<Teaching_Faculty> list =   criteria.list();
		return list;
	}

	// Faculty  First name not Equal to
	public List<Teaching_Faculty> getFacultyNEname(Teaching_Faculty faculty) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.ne("faculty_FirstName", faculty.getFaculty_FirstName()));
		List<Teaching_Faculty> list =   criteria.list();
		return list;
	}
	
	// Faculty ID Equal or Is Null
	public List<Teaching_Faculty> getFacultyeqOrIsNull(Teaching_Faculty faculty) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
		criteria.add(Restrictions.eqOrIsNull("faculty_Id", faculty.getFaculty_Id()));
		List<Teaching_Faculty> list =   criteria.list();
		return list;
	}
	
	public List<Teaching_Faculty> getFacultyByDepartment(Teaching_Faculty faculty) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Teaching_Faculty.class);
	    criteria.add(Restrictions.eq("faculty_Department", faculty.getFaculty_Department()));
	    List<Teaching_Faculty> list =   criteria.list();
		return list;
	}
	
}

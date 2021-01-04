package com.sandoval.backend.services.interfaces;

import java.util.List;

import com.sandoval.backend.models.entities.Student;

public interface IStudentService {
	public void save(Student student); //Acreate-update
	public Student findById(Long id);//retrieve
	public void delete(Long id);//delete
	public List<Student> findAll();//list
	
	/***  ***/
	
	public List<Student> findBySex(String gender);
	public Student findByLastName(String criteria);
	
}
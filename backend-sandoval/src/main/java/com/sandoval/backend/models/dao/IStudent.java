package com.sandoval.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sandoval.backend.models.entities.Student;

public interface IStudent extends CrudRepository <Student,Long>{

	public Student findByLastName(String criteria);
	
	@Query("SELECT st FROM Student st WHERE st.sex = :gender")
	public List<Student> findBySex(String gender);
	
}

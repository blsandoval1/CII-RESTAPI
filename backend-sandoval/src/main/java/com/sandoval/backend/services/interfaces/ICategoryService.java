package com.sandoval.backend.services.interfaces;

import java.util.List;

import com.sandoval.backend.models.entities.Category;

public interface ICategoryService {

	public Category findById(Long id);//retrieve
	public List<Category> findAll();//list
	
}

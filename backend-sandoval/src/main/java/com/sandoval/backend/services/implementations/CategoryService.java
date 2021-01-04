package com.sandoval.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sandoval.backend.models.dao.ICategory;
import com.sandoval.backend.models.entities.Category;
import com.sandoval.backend.services.interfaces.ICategoryService;

@Service
public class CategoryService implements ICategoryService{

	@Autowired //Inyeccion de dependecias
	private ICategory dao;

	@Override
	@Transactional(readOnly=true)
	public Category findById(Long id) {		
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Category> findAll() {		
		return (List<Category>) dao.findAll();
	}
	
}

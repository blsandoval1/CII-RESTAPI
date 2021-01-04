package com.sandoval.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sandoval.backend.models.entities.Club;

public interface IClub extends CrudRepository<Club, Long>{
	
	

}

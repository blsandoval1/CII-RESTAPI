package com.sandoval.backend.services.interfaces;

import java.util.List;

import com.sandoval.backend.models.entities.Club;

public interface IClubService {
	
	public Club findById(Long id);
	public List <Club> findAll();

}

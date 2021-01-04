package com.sandoval.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sandoval.backend.models.entities.Category;

public interface ISubject extends CrudRepository <Category,Long> {

}

package com.sandoval.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sandoval.backend.services.interfaces.ICategoryService;
import com.sandoval.backend.models.entities.Category;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired //Inyección de dependencias
    private ICategoryService service;

    @GetMapping("/category/{id}")
    public Category retrieve(@RequestParam(value="id") Long id) {
        return service.findById(id);
    }

    @GetMapping("/category")
    public List<Category> list(){
        return service.findAll();
    }
	
}
package com.sandoval.backend.controllers;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public class ResponseUtil implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	private HttpStatus status;
	private Object contect;
	
	public ResponseUtil(String message, HttpStatus status, Object contect) {
		super();
		this.message = message;
		this.status = status;
		this.contect = contect;
	}
	
}

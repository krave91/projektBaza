package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.Service;

@RestController
@RequestMapping("/controller")
public class Controller {
	@Autowired
	Service service;
	
	@RequestMapping("/get")
	public String Nasluchuj(){
		String result = service.pobierz();
		return result;
	}

}

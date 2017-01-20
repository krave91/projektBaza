package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.domain.Klient;
import com.example.domain.KlientRepository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	KlientRepository repozytoriumKlientow;
	
	public String pobierz(){
		Klient klient = repozytoriumKlientow.findById(new Long(0));
		return klient.getNazwisko();
	}

}

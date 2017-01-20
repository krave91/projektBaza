package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="KLIENT")
public class Klient {

	@Id
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	
	@Column(name="Imie", length=45)
	private String imie;
	
	@Column(name="Nazwisko", length=45)
	private String nazwisko;
	
	public String getNazwisko(){
		return nazwisko;
	}
}

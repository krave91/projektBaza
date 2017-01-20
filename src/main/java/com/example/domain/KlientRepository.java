package com.example.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KlientRepository extends CrudRepository<Klient, Long>{
	public Klient findById(@Param("id") Long id);
	
	 @Query("select k.Nazwisko from Klient k")
		public List<Klient> getKlient(@Param("id")Long id);
}

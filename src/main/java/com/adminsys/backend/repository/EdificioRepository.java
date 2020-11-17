package com.adminsys.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adminsys.backend.entity.Edificio;

@Repository
public interface EdificioRepository extends CrudRepository<Edificio, Long>{

	@Query("FROM Edificio")
	public List<Edificio> getAll();
}

package com.adminsys.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adminsys.backend.entity.SolicitudReservado;


@Repository
public interface SolicitudReservadoRepository extends CrudRepository<SolicitudReservado, Long>{

	@Query("FROM SolicitudReservado")
	public List<SolicitudReservado> getAll();
}

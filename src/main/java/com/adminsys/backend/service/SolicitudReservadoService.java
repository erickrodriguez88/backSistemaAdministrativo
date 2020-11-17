package com.adminsys.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminsys.backend.entity.SolicitudReservado;
import com.adminsys.backend.repository.SolicitudReservadoRepository;

@Service
public class SolicitudReservadoService {

	@Autowired
	SolicitudReservadoRepository solicitudReservadoRepo;
	
	public List<SolicitudReservado> getAll(){
		List<SolicitudReservado> list = solicitudReservadoRepo.getAll();
		return list;
	}
}

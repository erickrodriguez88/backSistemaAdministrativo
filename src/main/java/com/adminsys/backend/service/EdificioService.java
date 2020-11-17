package com.adminsys.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminsys.backend.entity.Edificio;
import com.adminsys.backend.repository.EdificioRepository;

@Service
public class EdificioService {

	@Autowired
	EdificioRepository edificioRepository;
	
	public List<Edificio> getAll(){
		List<Edificio> list = edificioRepository.getAll();
		return list;
	}
}

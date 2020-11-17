package com.adminsys.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adminsys.backend.entity.Edificio;
import com.adminsys.backend.service.EdificioService;

@RestController
public class EdificioController {

	@Autowired
	EdificioService edificioService;
	
	@RequestMapping(value="/edificios")
	public List<Edificio> getEdificioAll(){
		List<Edificio> list = edificioService.getAll();
		return list;
	}
}

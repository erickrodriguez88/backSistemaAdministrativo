package com.adminsys.backend.controller;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.adminsys.backend.entity.SolicitudReservado;
import com.adminsys.backend.service.SolicitudReservadoService;

@RestController
public class SolicitudReservadoController {

	@Autowired
	SolicitudReservadoService solicitudReservadoService;
	
    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Rest Service is online.";
    }
   
	@RequestMapping(value="/solicitudesReservado")
	public List<SolicitudReservado> getSolicitudReservadoAll(){
		List<SolicitudReservado> list = solicitudReservadoService.getAll();
		return list;
	}
	
	@RequestMapping(value="/JsonExample")
	public String getJsonExample() {
	JSONObject obj=new JSONObject();    
	  try {
		  obj.put("name","sonoo");
		  obj.put("age",new Integer(27));    
		  obj.put("salary",new Double(600000));
	} catch (JSONException e) {
		e.printStackTrace();
	}    
	return obj.toString();  
	}
}

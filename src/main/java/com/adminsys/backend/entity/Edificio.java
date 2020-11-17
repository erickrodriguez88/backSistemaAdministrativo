package com.adminsys.backend.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="workspaces",name="Edificio")
public class Edificio {
	
	@Id
	@Column(name="Id_Edificio")
	Integer Id_Edificio;
	
	@Column(name="Nombre")
	String Nombre;
	
	@Column(name="Modificado")
	Date Modificado;
	
	@Column(name="Creado")
	Date Creado;
	
	@Column(name="Creado_Por")
	String Creado_Por;
	
	@Column(name="Modificado_Por")
	String Modificado_Por;
	
	@Column(name="Id_Ciudad")
	Integer Id_Ciudad;

	public Integer getId_Edificio() {
		return Id_Edificio;
	}

	public void setId_Edificio(Integer id_Edificio) {
		Id_Edificio = id_Edificio;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Date getModificado() {
		return Modificado;
	}

	public void setModificado(Date modificado) {
		Modificado = modificado;
	}

	public Date getCreado() {
		return Creado;
	}

	public void setCreado(Date creado) {
		Creado = creado;
	}

	public String getCreado_Por() {
		return Creado_Por;
	}

	public void setCreado_Por(String creado_Por) {
		Creado_Por = creado_Por;
	}

	public String getModificado_Por() {
		return Modificado_Por;
	}

	public void setModificado_Por(String modificado_Por) {
		Modificado_Por = modificado_Por;
	}

	public Integer getId_Ciudad() {
		return Id_Ciudad;
	}

	public void setId_Ciudad(Integer id_Ciudad) {
		Id_Ciudad = id_Ciudad;
	}
}

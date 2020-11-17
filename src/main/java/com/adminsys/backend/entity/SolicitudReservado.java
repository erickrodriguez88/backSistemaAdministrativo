package com.adminsys.backend.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(schema="dbo", name="ViewSolicitudesEstadoReservado")
@Immutable
public class SolicitudReservado {

	@Id
	@Column(name="Id_Solicitud")
	Integer Id_Solicitud;
	
	@Column(name="Hora_Inicio")
	String Hora_Inicio;
		
	@Column(name="Hora_Fin")
	String Hora_Fin;
		      
	@Column(name="Creado_Por")
	String Creado_Por;
		     
	@Column(name="Fecha_Inicio")
	Date Fecha_Inicio;
		      
	@Column(name="Fecha_Fin")
	Date Fecha_Fin;
		      
	@Column(name="Estado")
	String Estado;
		 
	@Column(name="Id_Descriptivo")
	String Id_Descriptivo;
		     
	@Column(name="Id_Recurso")
	Integer Id_Recurso;
		      
	@Column(name="NombreEdificio")
	String NombreEdificio;

	public Integer getId_Solicitud() {
		return Id_Solicitud;
	}

	public void setId_Solicitud(Integer id_Solicitud) {
		Id_Solicitud = id_Solicitud;
	}

	public String getHora_Inicio() {
		return Hora_Inicio;
	}

	public void setHora_Inicio(String hora_Inicio) {
		Hora_Inicio = hora_Inicio;
	}

	public String getHora_Fin() {
		return Hora_Fin;
	}

	public void setHora_Fin(String hora_Fin) {
		Hora_Fin = hora_Fin;
	}

	public String getCreado_Por() {
		return Creado_Por;
	}

	public void setCreado_Por(String creado_Por) {
		Creado_Por = creado_Por;
	}

	public Date getFecha_Inicio() {
		return Fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}

	public Date getFecha_Fin() {
		return Fecha_Fin;
	}

	public void setFecha_Fin(Date fecha_Fin) {
		Fecha_Fin = fecha_Fin;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getId_Descriptivo() {
		return Id_Descriptivo;
	}

	public void setId_Descriptivo(String id_Descriptivo) {
		Id_Descriptivo = id_Descriptivo;
	}

	public Integer getId_Recurso() {
		return Id_Recurso;
	}

	public void setId_Recurso(Integer id_Recurso) {
		Id_Recurso = id_Recurso;
	}

	public String getNombreEdificio() {
		return NombreEdificio;
	}

	public void setNombreEdificio(String nombreEdificio) {
		NombreEdificio = nombreEdificio;
	}
		  
	
				  
}

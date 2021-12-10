package com.unab.sprint_purpura04.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document
@Setter
@Getter
public class Reserva{	
	
	@Id
	private String id;
	
	@Field("documento")
	private String documento;
	

	@Field("nombre")
	private String nombre;
	
	@Field("apellido")
	private String apellido;
	
	
	@Field("correo")
	private String correo;
	
	@Field("telefono")
	private String telefono;
	
	@Field("celular")
	private String celular;
	
	@Field("habitacion")
	private String habitacion;
	
	@Field("fecha_reserva")
	private String fecha_reserva;
}

package com.unab.sprint_purpura04.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document
@Setter
@Getter
public class Habitacion{	
	
	@Id
	private String id;
	
	@Field("cantidad")
	private String cantidad;
	
	@Field("nhabitacion")
	private String nhabitacion;
	
	@Field("nombre")
	private String nombre;
	
	@Field("apellido")
	private String apellido;
	
	@Field("direccion")
	private String direccion;
	
	@Field("correo")
	private String correo;
	
	@Field("telefono")
	private String telefono;
	
	@Field("celular")
	private String celular;
	
	@Field("genero")
	private String genero;
}

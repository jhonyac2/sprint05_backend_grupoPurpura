package com.unab.sprint_purpura04.service;

import java.util.List;
import java.util.Optional;

import com.unab.sprint_purpura04.Model.Habitacion;

public interface IHabitacionService {

	public List<Habitacion> all();
	
	public Optional<Habitacion> findById(String id);
	
	public Habitacion save(Habitacion habitacion);
	
	public void delete(String id);
}

package com.unab.sprint_purpura04.service;

import java.util.List;
import java.util.Optional;

import com.unab.sprint_purpura04.Model.Reserva;

public interface IReservaService {

	public List<Reserva> all();
	
	public Optional<Reserva> findById(String id);
	
	public Reserva save(Reserva reserva);
	
	public void delete(String id);
}

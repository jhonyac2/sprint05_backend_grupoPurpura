package com.unab.sprint_purpura04.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.unab.sprint_purpura04.Model.Reserva;
import com.unab.sprint_purpura04.repository.IReservaRepository;
import com.unab.sprint_purpura04.service.IReservaService;

@Service
public class ReservaService implements IReservaService {

	@Autowired
	private IReservaRepository repository;
	
	
	@Override
	public List<Reserva> all() {	
		return this.repository.findAll();
	}

	@Override
	public Optional<Reserva> findById(String id) {		
		return this.repository.findById(id);
	}

	@Override
	public Reserva save(Reserva reserva) {		
		return this.repository.save(reserva);
	}

	@Override
	public void delete(@PathVariable String id) {
		this.repository.deleteById(id);
	}

}

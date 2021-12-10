package com.unab.sprint_purpura04.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.unab.sprint_purpura04.Model.Habitacion;
import com.unab.sprint_purpura04.repository.IHabitacionRepository;
import com.unab.sprint_purpura04.service.IHabitacionService;

@Service
public class HabitacionService implements IHabitacionService {

	@Autowired
	private IHabitacionRepository repository;
	
	
	@Override
	public List<Habitacion> all() {	
		return this.repository.findAll();
	}

	@Override
	public Optional<Habitacion> findById(String id) {		
		return this.repository.findById(id);
	}

	@Override
	public Habitacion save(Habitacion habitacion) {		
		return this.repository.save(habitacion);
	}

	@Override
	public void delete(@PathVariable String id) {
		this.repository.deleteById(id);
	}

}

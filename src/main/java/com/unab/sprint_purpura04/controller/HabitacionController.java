package com.unab.sprint_purpura04.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.sprint_purpura04.Model.Habitacion;

import com.unab.sprint_purpura04.service.IHabitacionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/habitacion")
public class HabitacionController {
	
	@Autowired
	private IHabitacionService service;
	
	@GetMapping
	public List<Habitacion> all() {
		return service.all();
	}
	
	
	@GetMapping("{id}")
	public Optional<Habitacion> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	
		
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Habitacion save(@RequestBody Habitacion habitacion) {
		return service.save(habitacion);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Habitacion update(@PathVariable String id, @RequestBody Habitacion habitacion) {
		Optional<Habitacion> op = service.findById(id);
		Habitacion habitacionUpdate = new Habitacion();
		if (!op.isEmpty()) {
			habitacionUpdate = op.get();
			String idUpdate = habitacionUpdate.getId();			
			habitacionUpdate= habitacion;
			habitacionUpdate.setId(idUpdate);
		}
		
			
		return habitacion;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}

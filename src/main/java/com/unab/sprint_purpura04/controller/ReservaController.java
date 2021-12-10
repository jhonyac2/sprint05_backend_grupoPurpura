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

import com.unab.sprint_purpura04.Model.Reserva;

import com.unab.sprint_purpura04.service.IReservaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/reserva")
public class ReservaController {
	
	@Autowired
	private IReservaService service;
	
	@GetMapping
	public List<Reserva> all() {
		return service.all();
	}
	
	
	@GetMapping("{id}")
	public Optional<Reserva> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	
		
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Reserva save(@RequestBody Reserva reserva) {
		return service.save(reserva);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Reserva update(@PathVariable String id, @RequestBody Reserva reserva) {
		Optional<Reserva> op = service.findById(id);
		Reserva reservaUpdate = new Reserva();
		if (!op.isEmpty()) {
			reservaUpdate = op.get();
			String idUpdate = reservaUpdate.getId();			
			reservaUpdate= reserva;
			reservaUpdate.setId(idUpdate);
		}
		
			
		return reserva;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}

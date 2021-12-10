package com.unab.sprint_purpura04.repository;

//import org.springframework.data.jpa.repository.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.sprint_purpura04.Model.Reserva;

public interface IReservaRepository extends MongoRepository<Reserva, String>{

}



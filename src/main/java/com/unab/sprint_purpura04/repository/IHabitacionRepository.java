package com.unab.sprint_purpura04.repository;

//import org.springframework.data.jpa.repository.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.sprint_purpura04.Model.Habitacion;

public interface IHabitacionRepository extends MongoRepository<Habitacion, String>{

}



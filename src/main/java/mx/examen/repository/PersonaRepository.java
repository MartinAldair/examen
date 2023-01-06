package mx.examen.repository;

import mx.examen.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("personaRepository")
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}

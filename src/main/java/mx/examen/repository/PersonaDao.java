package mx.examen.repository;

import java.util.List;
import mx.examen.model.Persona;

public interface PersonaDao {

    public List<Persona> encontrarTodasLasPersonas();

    public Persona encontrarPersonaPorId(Integer id);

}

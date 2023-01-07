package mx.examen.service;

import java.util.List;
import mx.examen.model.Persona;

public interface PersonaService {

    Persona encontrarPersonaPorId(Integer id);

    List<Persona> encontrarTodasLasPersonas();

}

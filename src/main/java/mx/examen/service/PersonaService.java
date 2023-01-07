package mx.examen.service;

import java.util.List;
import mx.examen.model.Persona;

/**
 * Interfaz de PersonaService
 *
 * Se define en esta interface con todos los métodos que necesitemos en donde
 * implementaremos toda la lógica de negocio.
 */
public interface PersonaService {

    Persona encontrarPersonaPorId(Integer id);

    List<Persona> encontrarTodasLasPersonas();

}

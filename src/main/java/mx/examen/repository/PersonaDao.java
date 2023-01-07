package mx.examen.repository;

import java.util.List;
import mx.examen.model.Persona;

/**
 * Interfaz de patrón DAO
 *
 * Se define esta interfaz para acceder a los datos asociados a ella a nivel de
 * persistencia.
 */
public interface PersonaDao {

    public List<Persona> encontrarTodasLasPersonas();

    /**
     * @param id id de persona.
     * @return si una persona con id <code>id</code> existe retorna su
     * informacion que se encuentra en la capa DAO donde se simula la
     * recuperación de la información, en caso contrario retorna vacio.
     */
    public Persona encontrarPersonaPorId(Integer id);

}

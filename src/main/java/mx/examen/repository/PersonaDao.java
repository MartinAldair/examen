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

    /**
     * Método para obtener una lista de personas
     *
     * @return retorna una lista de todas las personas que se encuentran en la
     * capa DAO donde se simula la recuperación de la información
     */
    public List<Persona> encontrarTodasLasPersonas();

    /**
     * Método para buscar una persona por id
     *
     * @param id id de persona.
     * @return si una persona con id <code>id</code> existe retorna su
     * informacion que se encuentra en la capa DAO donde se simula la
     * recuperación de la información, en caso contrario retorna vacio.
     */
    public Persona encontrarPersonaPorId(Integer id);

}

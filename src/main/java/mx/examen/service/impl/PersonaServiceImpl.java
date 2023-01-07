package mx.examen.service.impl;

import java.util.List;
import mx.examen.model.Persona;
import mx.examen.repository.impl.PersonaDaoImpl;
import mx.examen.service.PersonaService;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Service("personaServiceImpl")
public class PersonaServiceImpl implements PersonaService {
    
    private static final Logger log = LoggerFactory.getLogger(PersonaServiceImpl.class);
    
    @Autowired
    private PersonaDaoImpl personaDaoImpl;
    
    @Override
    public Persona encontrarPersonaPorId(Integer id) {
        log.info("Método para buscar una persona por id que se encuentran en la "
                + "capa DAO donde se simula la recuperación de la información");
        return this.personaDaoImpl.encontrarPersonaPorId(id);
    }
    
    @Override
    public List<Persona> encontrarTodasLasPersonas() {
        log.info("Método para obtener una lista de todas las personas que se encuentran en la "
                + "capa DAO donde se simula la recuperación de la información");
        List<Persona> listaDeUsuarios = (List<Persona>) this.personaDaoImpl.encontrarTodasLasPersonas();
        return listaDeUsuarios;
    }
    
}

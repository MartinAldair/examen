package mx.examen.service.impl;

import java.util.List;
import mx.examen.model.Persona;
import mx.examen.repository.PersonaRepository;
import mx.examen.service.PersonaService;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Service("personaServiceImpl")
public class PersonaServiceImpl implements PersonaService {

    private static final Logger log = LoggerFactory.getLogger(PersonaServiceImpl.class);

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona guardarPersona(Persona persona) {
        log.info("Método para guardar los datos de un persona en la base de datos");
        return this.personaRepository.save(persona);
    }

    @Override
    public Persona encontrarPersonaPorId(Integer id) {
        log.info("Método para buscar una persona por id que se encuentran en la base de datos");
        return this.personaRepository.findById(id).get();
    }

    @Override
    public List<Persona> encontrarTodosLasPersonas() {
        log.info("Método para obtener una lista de todas las personas que se encuentran en la base de datos");
        List<Persona> listaDeUsuarios = (List<Persona>) this.personaRepository.findAll();
        return listaDeUsuarios;
    }

}

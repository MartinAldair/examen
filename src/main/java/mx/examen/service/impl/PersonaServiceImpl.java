package mx.examen.service.impl;

import java.util.List;
import mx.examen.model.Persona;
import mx.examen.repository.impl.PersonaDaoImpl;
import mx.examen.service.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("personaServiceImpl")
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDaoImpl personaDaoImpl;

    @Override
    public Persona encontrarPersonaPorId(Integer id) {
        return this.personaDaoImpl.encontrarPersonaPorId(id);
    }

    @Override
    public List<Persona> encontrarTodasLasPersonas() {
        List<Persona> listaDeUsuarios = (List<Persona>) this.personaDaoImpl.encontrarTodasLasPersonas();
        return listaDeUsuarios;
    }

}

package mx.examen.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.Persona;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import mx.examen.service.impl.PersonaServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-06T19:40:43.392Z[GMT]")
@RestController
@Tag(name = "persona", description = "Acceso a los datos de la Persona")
public class PersonaApiController implements PersonaApi {

    private static final Logger log = LoggerFactory.getLogger(PersonaApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PersonaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @org.springframework.beans.factory.annotation.Autowired
    private PersonaServiceImpl personaServiceImpl;

    @Override
    public ResponseEntity<Persona> obtienePersonaPorId(@Parameter(in = ParameterIn.PATH, description = "El Id de persona retorna", required = true, schema = @Schema()) @PathVariable("personaId") Integer personaId) {
        String accept = request.getHeader("Accept");
        Persona response = new Persona();
        if (accept != null && accept.contains("application/json")) {
            try {
                mx.examen.model.Persona persona = this.personaServiceImpl.encontrarPersonaPorId(personaId);
                if (persona == null) {
                    return new ResponseEntity<Persona>(HttpStatus.NOT_FOUND);
                } else {
                    response.setId(persona.getId());
                    response.setNombre(persona.getNombre());
                    response.setApellidos(persona.getApellidos());
                    response.setRfc(persona.getRfc());
                    response.setCurp(persona.getCurp());
                    response.setEdad(persona.getEdad());
                    response.setSexo(persona.getSexo());
                    response.setNacionalidad(persona.getNacionalidad());
                    String json = this.objectMapper.writeValueAsString(response);
                    return new ResponseEntity<Persona>(this.objectMapper.readValue(json, Persona.class), HttpStatus.OK);
                }
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Persona>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<Persona>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Persona>> obtieneTodasLasPersonas() {
        String accept = request.getHeader("Accept");
        List<Persona> response = new ArrayList<>();
        Persona personaResponse = new Persona();
        if (accept != null && accept.contains("application/json")) {
            try {
                List<mx.examen.model.Persona> listaDeUsuarios = this.personaServiceImpl.encontrarTodasLasPersonas();
                List<Persona> listaDeUsuariosResponse = listaDeUsuarios
                        .stream()
                        .map(elemento -> {
                            personaResponse.setId(elemento.getId());
                            personaResponse.setNombre(elemento.getNombre());
                            personaResponse.setApellidos(elemento.getApellidos());
                            personaResponse.setRfc(elemento.getRfc());
                            personaResponse.setCurp(elemento.getCurp());
                            personaResponse.setEdad(elemento.getEdad());
                            personaResponse.setSexo(elemento.getSexo());
                            personaResponse.setNacionalidad(elemento.getNacionalidad());
                            return personaResponse;
                        })
                        .collect(Collectors.toList());
                response.addAll(listaDeUsuariosResponse);
                String json = this.objectMapper.writeValueAsString(response);
                return new ResponseEntity<List<Persona>>(this.objectMapper.readValue(json, List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Persona>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<List<Persona>>(HttpStatus.OK);
    }

}

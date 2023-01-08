package mx.examen.model;

/**
 * DAO Pattern model Class
 *
 * El modelo de la clase Persona representa un objeto con la lógica de negocio,
 * en la cual se utiliza para retener datos para transportarlos entre capas.
 */
import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Se agrega los campos con el tipo de datos privado
     */
    private Integer id;

    private String nombre;

    private String apellidos;

    private String rfc;

    private String curp;

    private Integer edad;

    private String sexo;

    private String nacionalidad;

    /**
     * Constructor con 8 parametros
     *
     * @param id identificador unico de la persona
     * @param nombre nombre de la persona
     * @param apellidos apellidos de la persona
     * @param rfc rfc de la persona
     * @param edad edad de la persona
     * @param sexo sexo del empleado
     * * @param nacionalidad nacionalidad de la persona
     */
    public Persona(Integer id, String nombre, String apellidos, String rfc, String curp, Integer edad, String sexo, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rfc = rfc;
        this.curp = curp;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    } // Cierre del constructor

    /**
     * Se agregan los getter y setter
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Se crea el método toString().
     */
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", rfc=" + rfc + ", curp=" + curp + ", edad=" + edad + ", sexo=" + sexo + ", nacionalidad=" + nacionalidad + '}';
    }

}

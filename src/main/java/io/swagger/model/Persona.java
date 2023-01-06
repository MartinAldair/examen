package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Persona
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-06T19:40:43.392Z[GMT]")


public class Persona   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("apellidos")
  private String apellidos = null;

  @JsonProperty("rfc")
  private String rfc = null;

  @JsonProperty("curp")
  private String curp = null;

  @JsonProperty("edad")
  private Integer edad = null;

  @JsonProperty("sexo")
  private String sexo = null;

  @JsonProperty("nacionalidad")
  private String nacionalidad = null;

  public Persona id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Persona nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Persona apellidos(String apellidos) {
    this.apellidos = apellidos;
    return this;
  }

  /**
   * Get apellidos
   * @return apellidos
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public Persona rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }

  /**
   * Get rfc
   * @return rfc
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRfc() {
    return rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public Persona curp(String curp) {
    this.curp = curp;
    return this;
  }

  /**
   * Get curp
   * @return curp
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getCurp() {
    return curp;
  }

  public void setCurp(String curp) {
    this.curp = curp;
  }

  public Persona edad(Integer edad) {
    this.edad = edad;
    return this;
  }

  /**
   * Get edad
   * @return edad
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public Persona sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

  /**
   * Get sexo
   * @return sexo
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Persona nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }

  /**
   * Get nacionalidad
   * @return nacionalidad
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getNacionalidad() {
    return nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.id, persona.id) &&
        Objects.equals(this.nombre, persona.nombre) &&
        Objects.equals(this.apellidos, persona.apellidos) &&
        Objects.equals(this.rfc, persona.rfc) &&
        Objects.equals(this.curp, persona.curp) &&
        Objects.equals(this.edad, persona.edad) &&
        Objects.equals(this.sexo, persona.sexo) &&
        Objects.equals(this.nacionalidad, persona.nacionalidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, apellidos, rfc, curp, edad, sexo, nacionalidad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellidos: ").append(toIndentedString(apellidos)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    edad: ").append(toIndentedString(edad)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

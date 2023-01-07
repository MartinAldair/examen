package mx.examen.support;

/*
Para implementar una excepción personalizada en Java existen de dos formas de
hacerlo en este caso, se utilizo el metodo Unchecked Exception que son aquellas 
que pueden ocurrir en tiempo de ejecución, por lo que para crear este tipo de 
excepción se tiene que extender de runtime.

El actual ejemplo va obtener una excepción en tiempo de ejecución porque en este 
caso en el momento que se introduzca una fecha con formato invalido de tipo 
string, una excepción será lanzada en el tiempo de ejecución.
 */
public class MiExcepcionPersonalizada extends RuntimeException {

    private static final long serialVersionUID = -8460356990632230194L;

    public MiExcepcionPersonalizada() {
        super();
    }

    public MiExcepcionPersonalizada(String message, Throwable cause) {
        super(message, cause);
    }

    public MiExcepcionPersonalizada(String message) {
        super(message);
    }

    public MiExcepcionPersonalizada(Throwable cause) {
        super(cause);
    }

}

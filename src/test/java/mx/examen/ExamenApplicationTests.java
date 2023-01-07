package mx.examen;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExamenApplicationTests {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /*
    5.	Manejo de Errores
    5.1	Dado la siguiente clase agrega el manejo de errores correspondientes y justifica él porque
     */
    @Test
    void ejercicio5_1() {
        System.out.println("Intentamos ejecutar el bloque de instrucciones:");
        System.out.println("Instrucción 1.");
        /* 
        En el presente ejercicio se utiliza el bloque try-catch, porque sirve para
        saber el tipo de excepción que esta en el metodo parseInt() de la clase Integer.
        Al momento ejecutarse el metodo parseInt() y al no encontrar caracteres de
        tipo numerico y solamente letras, se produce una excepción de tipo 
        java.lang.NunmberFormatException
         */
        try {
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
        } catch (Exception ex) {
            log.error("Tipo de error: " + ex);
        }
        System.out.println("Instrucción 2.");
        System.out.println("Instrucción 3, etc.");
    }

}

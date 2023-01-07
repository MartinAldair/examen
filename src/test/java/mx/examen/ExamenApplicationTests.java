package mx.examen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExamenApplicationTests {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /* 
    3. Supone que debes establecer una contraseña para una cuenta bancaria. 
    Sin embargo, hay tres restricciones en el formato de la contraseña:
    a) Debe contener solo caracteres alfanuméricos (a−z, A−Z, 0−9);
    b) Debe haber un número par de letras;
    c) Debe haber un número impar de dígitos.
    
    En la variable se define las 3 restricciones para que sea valida el formato
    de la contraseña.
    Explicacion del contenido de la variable pattern:
    ^ Indica el principio de una cadena
    ( Indica el principio del agrupamiento de parte de una expresión
    [ Indica el principio del conjunto de caracteres de la expresión
    BDFHJLNPRTVXZbdfhjlnprtvxz?13579 Este conjunto de cadena de caracteres indica
    las condiciones de los incisos a) b) y c)
    \\s Indica que coincide con un solo carácter de espacio en blanco
    ] Indica el final del conjunto de caracteres de la expresión
    {1,200} Indica un número o intervalo de longitud de la expresión
    ( Indica el final del agrupamiento de parte de una expresión
    $ Indica el final de una cadena
     */
    String pattern = "^([BDFHJLNPRTVXZbdfhjlnprtvxz?13579\\s]{1,200})$";
    String text1 = "test 5 a0A pass007 ?xy1";
    String text2 = "bd 35 Bbdfh135";

    /*
    Como input debe recibir una cadena S de N caracteres.  La cadena S se puede 
    dividir en palabras dividiéndola y eliminando los espacios. El objetivo es 
    elegir la palabra más larga que sea una contraseña válida. Puede suponer que, 
    si hay K espacios en la cadena S, entonces hay exactamente K + 1 palabras.
    
    Por ejemplo, dado "test 5 a0A pass007 ?xy1", hay cinco palabras y tres de 
    ellas son contraseñas válidas: "5", "a0A" y "pass007". Por lo tanto, la 
    contraseña más larga es "pass007" y su longitud es 7.
    
    Genera una clase que, dada una cadena S no vacía que consta de N caracteres, 
    devuelve la longitud de la palabra más larga de la cadena que es una contraseña válida. 
    Si no existe tal palabra, su función debería devolver −1, como se explicó anteriormente.
    
Asumir que:

N es un número entero dentro del rango [1..200];
La cadena S consta únicamente de caracteres y espacios ASCII imprimibles.

     */
    @Test
    void ejercicio3() {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text2);
        Boolean b = m.matches();
        if (!b) {
            log.info("La contraseña no cumple con el patron de requisitos para ser valida" + b);
        } else {
            String[] password = m.group().split(" ");
            String longestPassword = Arrays.asList(password).stream().max(Comparator.comparingInt(String::length)).get();
            Integer passwordLeght = longestPassword.length() > 0 ? 0 : -1;
            if (passwordLeght.equals(0)) {
                log.info("Contraseña: " + longestPassword);
            } else {
                log.info("Contraseña invalida");
            }
        }
    }

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

    /*
    5.2	Dado el siguiente método, agregar el código necesario para que el método genere una excepción personalizada en caso de error.
     */
    public static Date getFecha(String fecha, String formato) {
        SimpleDateFormat formatter = new SimpleDateFormat(formato);
        String dateInString = fecha;
        Date fechaSalida = null;
        try {
            fechaSalida = formatter.parse(dateInString);
        } catch (ParseException e) {
            LOGGER.error("Error" + e);
        }

        return fechaSalida;
    }

}

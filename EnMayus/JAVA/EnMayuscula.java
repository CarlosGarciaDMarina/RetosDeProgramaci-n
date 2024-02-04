package JAVA;

import java.util.Scanner;
/*
 * EnMayuscula
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan
 * directamente.
 */
public class EnMayuscula {
    public static String enMayus(String cadena) {
        // Convertimos el String a un array de caracteres para poder interactuar con el primer caracter
        char[] letras = cadena.toCharArray();
        // Ponemos en mayúscula la primera letra de cada palabra
        for (int i = 0; i < letras.length; i++) {
            // Verificamos si es la primera letra o si la letra anterior es un espacio
            if (i == 0 || letras[i - 1] == ' ') {
                letras[i] = Character.toUpperCase(letras[i]);
            }
        }
        // Transformamos el array de caracteres a string y lo devolvemos
        return new String(letras);
    }

    public static void main(String[] args) {
        // Variables que vamos a necesitar
        String cadena = "";
        String resultado = "";
        // Gestion de errores con trycatch
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Dame una palabra o conjunto de palabras y te dare la primera letra de cada palabra en mayus:");
            cadena = sc.nextLine();// Almacenamos la respuesta
            // Llamamos a la funcion y almacenamos el resultado en la variable
            resultado = enMayus(cadena);
            // Imprimimos el resultado
            System.out.println(resultado);
        } catch (Exception e) {
            // Error en el Scanner
            System.out.println("Ha ocurrido un error con el Scanner, el programa ha finalizado.");
        }
    }
}

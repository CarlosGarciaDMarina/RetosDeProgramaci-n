/*          ANAGRAMA
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    // Funciones
    public static boolean esAnagrama(String palabra, String palabraDos) {

        // El primer paso es convertir las palabras a minusculas y quitar los espacios
        // en blanco
        palabra = palabra.toLowerCase().replaceAll("  ", " ");
        // Lo mismo con la palabra 2
        palabraDos = palabraDos.toLowerCase().replaceAll("  ", " ");

        if (palabra.length() != palabraDos.length()) {
            return false;
        } else {
            // Convertimos las palabras en arrays
            char[] charPalabra = palabra.toCharArray();
            char[] charPalabraDos = palabraDos.toCharArray();

            // Ahora las ordenamos y las separamos
            Arrays.sort(charPalabra);
            Arrays.sort(charPalabraDos);

            return Arrays.equals(charPalabra, charPalabraDos);
        }
    }

    // Main
    public static void main(String[] args) {

        // Inicializamos el scanner
        Scanner sc = new Scanner(System.in);

        // Definimos las variables
        String palabra = "";
        String palabraDos = "";

        // Avisamos al usuario y les pedimos las palabras
        System.out.println("Esta función determina si dos palabras son anagramas.");
        System.out.println("Dame la primera palabra.");
        palabra = sc.nextLine();

        System.out.println("Dame la segunda palabra.");
        palabraDos = sc.nextLine();

        //Cerramos el scanner para liberar recursos
        sc.close();
        // Si resultado es true es un anagrama
        if (esAnagrama(palabra, palabraDos)) {
            System.out.println("Sí, son anagramas.");
        } else {
            System.out.println("No son anagramas.");
        }

    }
}
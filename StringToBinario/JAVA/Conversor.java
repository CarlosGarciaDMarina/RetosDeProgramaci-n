/*
 * Crea un programa se encargue de transformar una cadena de texto a binario 
 * sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
package JAVA;

public class Conversor {
    public static void main(String[] args) {   
        //Primero inicializamos las variables que vamos a necesitar para desarrollar el ejercicio
        String cadena[] = {"Esto es un mensaje de prueba"};
        String cadenaConvertida = "";
        //Creamos un bucle que recorra la cadena y almacene las letas dentro de cadenaConvertida
        for (int i = 0; i < cadena.length; i++) {
            //Creamos un bucle que recorra cada letra del array
            for(int j = 0; j < cadena[i].length() ; j++){
                //Creamos un condicional que cada vez que identifique una vocal en la palabra, la convierta en 1
                if ((cadena[i].charAt(j) == 'a') || (cadena[i].charAt(j) == 'e') || (cadena[i].charAt(j) == 'i') || 
                    (cadena[i].charAt(j) == 'o') || (cadena[i].charAt(j) == 'u')) {
                    cadenaConvertida += "1";     
                } else {
                    //En caso contrario será un 0
                    cadenaConvertida += "0";
                }
            }
        }
        //Imprimimos por pantalla
        System.out.println(cadenaConvertida);
    }
}
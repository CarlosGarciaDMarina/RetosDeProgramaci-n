/*      Invirtiendo Cadenas
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
 package JAVA;

 public class InvirtiendoCadenas {
 
    public static void main(String[] args) {
        //Declaramos las variables
        int i = 0;
        int j = 0;
        String cadenaInvertida = "";

        //Primero creamos el array
        String[] cadena = {"Hola", "Mundo"};

        //Creamos un bucle for que recorra el array e imprima lo que haya dentro del array desde el final hacia el principio
        for(i = cadena.length -1; i >= 0; i--){
            //Inicializamos el string palabra invertida
            String palabraInvertida = "";
            
            //Este bucle recorre cada letra de la palabra actual (cadena[i]) de manera inversa.
            for(j = cadena[i].length() - 1; j >= 0; j--){
                //Almacenamos en la funcion cada letra dentro de la cadena
                palabraInvertida += cadena[i].charAt(j);
            }
            //Agregamos la palabra invertida a la variable cadena invertida dejando un pequeño espacio para mayor legibilidad
            cadenaInvertida += palabraInvertida + " ";
        }
        //Imprimimos por pantalla
        System.out.println(cadenaInvertida);
    }
 }
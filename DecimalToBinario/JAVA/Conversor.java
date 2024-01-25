/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
package JAVA;

import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        //Pedimos al usuario un numero para ejecutar el programa y lo encerramos en un try catch para gestionar los errores que puedan ocurrir
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Este programa convierte un numero decimal a binario, dame un numero decimal: ");
            long decimal = sc.nextLong();
            
            //Llamamos a Stringbuilder porque es mas eficiente para concatenar que un String normal
            StringBuilder binario = new StringBuilder();

            //Creamos un bucle que va a dividir el numero hasta que sea 0
            while (decimal > 0) {
                //
                long resto = decimal % 2;
                binario.insert(0, resto); //Insertamos el residuo al principio para poder leer el numero binario corretamente
                decimal/=2; //Dividimo el decimal entre 2, si el resultado es mayor que 0 se repetira el bucle hasta que éste sea 0
            }
            //Imprimimos el resultado por pantalla
            System.out.println("El numero binario es " + binario.toString());

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
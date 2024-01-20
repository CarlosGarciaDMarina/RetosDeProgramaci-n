package JAVA;
/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */ 
public class Fibonacci {

    public static void main(String[] args) {

        //Inicializamos las variables
        long primero = 0;
        long segundo = 1;
        int n = 50;

        //Mostramos por pantalla al usuario lo que vamos a imprimir
        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(primero + " ");

            //Calculamos los siguientes numeros sumando los dos anteriores
            long siguiente = primero + segundo;

            //Actualizamos los terminos para la siguiente vuelta del bucle
            primero = segundo;
            segundo = siguiente;
        }
    }
}
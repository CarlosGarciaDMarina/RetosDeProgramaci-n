/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
package JAVA;

import java.util.Scanner;

public class EsPrimo {

    //Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        return num % 2 == 1;
    }

    public static void main(String[] args) {
        //Llamamos a la función del scanner
        Scanner sc = new Scanner(System.in);
        //Creamos las variables que necesitemos
        int i = 0;

        //Código adicional para verificar si un número es primo y para imprimir primos entre 1 y 100
        System.out.println("Dame un numero y te diré si es primo:");
        int num = sc.nextInt();

        //Establecemos las condiciones para que imprima si es primo o no lo es
        if (esPrimo(num)) {
            System.out.println("El número " + num + " es primo.");
            System.out.println("");
        } else {
            System.out.println("El número " + num + " no es primo.");
            System.out.println("");
        }
        //Avisamos al usuario de que le vamos a mostrar todos los numeros primos entre el 1 y el 100
        System.out.println("Ahora te mostraré todos los numeros primos entre el 1 y el 100.");

        //Hacemos un bucle que recorra los 100 primeros numeros y apunte los que son primos
        for(i = 0; i < 101; i++){
            //Si es primo lo imprimos por pantalla
            if(esPrimo(i)){
                System.out.println(i);
            } 
        }
        // Cerramos el escáner
        sc.close();
    }
}
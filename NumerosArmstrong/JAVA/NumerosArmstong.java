package JAVA;

import java.util.Scanner;

/**
 * NumerosArmstong
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto. 
 * 
 * NumerosArmstong:
 * 1
 * 5
 * 9
 * 153
 * 370
 * 371
 * 407
 * 1634
 * 8208
 * 9474
 * 54748
 * 92727
 * 93084
 * 548834
 * 1741725
 */
public class NumerosArmstong {

    // Con esta funcion determinamos si el numero es de armstrong o no
    private static boolean numArm(long num) {
        // Lo primero es convertir el numero a cadena
        String numCadena = Long.toString(num);
        // Ahora llamamos a la funcion que calcula la suma de los cubos
        int sumaCubos = calcularSumaCubos(numCadena);
        // Devolvemos si es false o no
        return sumaCubos == num;
    }

    // Esta funcion va a hacer la suma de los digitos del numero
    private static int calcularSumaCubos(String numCadena) {
        // Declaramos la variable
        int sumaCubos = 0;
        // Abrimos un bucle for que va a recorrer digito a digito el numero
        for (int i = 0; i < numCadena.length(); i++) {
            // Le damos un valor numérico
            int digito = Character.getNumericValue(numCadena.charAt(i));
            // Elevamos cada digito a 3 y lo sumamos a la vriable
            sumaCubos += (int) Math.pow(digito, numCadena.length());
        }
        // Devolvemos el resultado
        return sumaCubos;
    }

    public static void main(String[] args) {
        // Asignamos un valor a num
        long num = 0;
        //Scanner para preguntar al usuario
        Scanner sc = new Scanner(System.in);
        //Pedimos el num y lo almacenamos
        System.out.println("Dame un numero y te digo si es un numero primo: ");
        num = sc.nextLong();

        // Verificar si el número es un número de Armstrong
        if (numArm(num)) {
            System.out.println("Sí, el número " + num + " es un número de Armstrong");
        } else {
            System.out.println("No, el número " + num + " no es un número de Armstrong");
        }
        //Cerramos el scanner
        sc.close();
    }
}


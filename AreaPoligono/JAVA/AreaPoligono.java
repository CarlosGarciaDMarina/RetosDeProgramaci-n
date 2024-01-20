/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
package JAVA;

import java.util.Scanner;

public class AreaPoligono {

    // Funciones
    // Esta funcion te permite calcular el area de un poligono
    public static float areaPoligono(int opcion, float lado, float base, float altura) {
        // Creamos la variable
        float resultado = 0.0f;
        // Creamos las condiciones del programa
        if (opcion == 1) {
            // Triángulo
            resultado = (base * altura) / 2;
            return resultado;

        } else if (opcion == 2) {
            // Cuadrado
            resultado = lado * lado;
            return resultado;

        } else if (opcion == 3) {
            // Rectángulo
            resultado = base * altura;
            return resultado;

        } else {
            System.out.println("Solo aceptamos números y solo hay 3 opciones");
            return 0;
        }
    }

    public static void main(String[] args) {

        // Declaramos el scanner y las variables con las que vamos a trabajar
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        float base = 0.0f;
        float altura = 0.0f;
        float lado = 0.0f;
        float resultado = 0.0f;

        // Creamos un bucle para el programa
        do {
            // Mostramos el programa y le pedimos al usuario que seleccione una opción
            System.out.println("|-----------------------|");
            System.out.println("|0.- Salir.             |");
            System.out.println("|1.- Triángulo.         |");
            System.out.println("|2.- Cuadrado.          |");
            System.out.println("|3.- Rectángulo.        |");
            System.out.println("|-----------------------|");
            System.out.println(" Selecciona una opción del menú");
            respuesta = sc.nextInt();

            switch (respuesta) {
                case 0:
                    // Avisamos al usuario de que se va a cerrar el programa
                    System.out.println("Se cerrará el programa.");
                    break;

                case 1: // Triángulo
                    // Pedimos al usuario la base y la altura del triángulo
                    System.out.println("Ha seleccionado la opción del Triángulo.");
                    System.out.println("Introduce su base:");
                    base = sc.nextFloat();
                    System.out.println("Introduce su altura:");
                    altura = sc.nextFloat();
                    // Mostramos el resultado al usuario
                    System.out.println("El área del triángulo es " + areaPoligono(1, lado, base, altura));
                    break;

                case 2: // Cuadrado
                    // Pedimos al usuario el lado del cuadrado
                    System.out.println("Ha seleccionado la opción del cuadrado.");
                    System.out.println("Introduce su lado:");
                    lado = sc.nextFloat();
                    // Almacenamos el resultado de la funcion
                    resultado = areaPoligono(2, lado, base, altura);
                    // Mostramos el resultado al usuario
                    System.out.println("El área del cuadrado es " + resultado);
                    break;

                case 3: // Rectángulo
                    // Pedimos al usuario la base y la altura del rectángulo
                    System.out.println("Ha seleccionado la opción del rectángulo.");
                    System.out.println("Introduce su base:");
                    base = sc.nextFloat();
                    System.out.println("Introduce su altura:");
                    altura = sc.nextFloat();
                    // Almacenamos el resultado de la funcion
                    resultado = areaPoligono(3, lado, base, altura);
                    // Mostramos el resultado al usuario
                    System.out.println("El área del rectángulo es " + resultado);
                    break;

                default:
                    System.out.println("Ha elegido una opción que no se encuentra en el menú.");
                    System.out.println("Se cerrará el programa.");
                    break;
            }

        } while ((respuesta > 0) && (respuesta < 4));
        sc.close(); // Cerramos el scanner para optimizar recursos
    }
}
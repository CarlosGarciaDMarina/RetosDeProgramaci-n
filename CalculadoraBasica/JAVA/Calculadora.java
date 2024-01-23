/*
 * Calculadora
 * crea una calculadora con interfaz utlizando las minimas lineas de codigo posibles
 * que sea modular
 * EXTRA: Gestion de errores
 */
package JAVA;

import java.util.Scanner;

public class Calculadora { 

    //Funciones
    //Funcion para sumar
    public static float sumar(float num1, Float num2){
        return num1 + num2;
    }
    //Funcion para restar
    public static float restar(float num1, Float num2){
        return num1 - num2;
    }
    //Funcion para dividir
    public static float multiplicar(float num1, Float num2){
        return num1 * num2;
    }
    //Funcion para multiplicar
    public static float dividir(float num1, Float num2){
        if ((num1 == 0) || (num2 == 0)) {
            return 0;
        } else {
            return num1 / num2;  
        }

    }

    public static void main(String[] args) {

        //Creamos las variables
        float num1 = 0.0f;
        float num2 = 0.0f;
        int respuesta = 0;
        float resultado = 0.0f;

        //Encerramos el Scanner en un try-catch para gestionar errores
        try (Scanner sc = new Scanner(System.in)) {

            //Creamos un bucle do-while para que se repita la calculadora hasta que salgamos de ella
            do {
                System.out.println("|-----------------------|");
                System.out.println("|0. Salir.              |");
                System.out.println("|1. Sumar.              |");
                System.out.println("|2. Restar.             |");
                System.out.println("|3. Multiplicar.        |");
                System.out.println("|4. Dividir.            |");
                System.out.println("|-----------------------|");
                System.out.println("Elige una opcion del menú:");
                respuesta = sc.nextInt();
                
                switch (respuesta) {
                    case 0:
                    //Salir
                        System.out.println("El programa ha finalizado.");
                        break;
                    case 1:
                    //Sumar
                        System.out.println("Has seleccionado la opcion de sumar.");
                        System.out.println("Introduce el primer número: ");
                        num1 = sc.nextFloat(); //Capturamos la respuesta del usuario
                        System.out.println("Introduce el segundo número: ");
                        num2 = sc.nextFloat(); //Capturamos la respuesta del usuario

                        //Almacenamos el resultado de la suma en una variable
                        resultado = sumar(num1, num2);
                        //Mostramos por pantalla
                        System.out.println("El resultado de sumar los numeros " + num1 + " y " + num2 + " es: " + resultado);

                        break;
                    case 2:
                    //Restar
                        System.out.println("Has seleccionado la opcion de restar.");
                        System.out.println("Introduce el primer numero: ");
                        num1 = sc.nextFloat(); //Capturamos la respuesta del usuario
                        System.out.println("Introduce el segundo número: ");
                        num2 = sc.nextFloat(); //Capturamos la respuesta del usuario

                        //Almacenamos el resultado de la suma en una variable
                        resultado = restar(num1, num2);
                        //Mostramos por pantalla
                        System.out.println("El resultado de restar los numeros " + num1 + " y " + num2 + " es: " + resultado);
                        break;
                    case 3:
                    //Multiplicar
                        System.out.println("Has seleccionado la opcion de multiplicar.");
                        System.out.println("Introduce el primer numero: ");
                        num1 = sc.nextFloat(); //Capturamos la respuesta del usuario
                        System.out.println("Introduce el segundo número: ");
                        num2 = sc.nextFloat(); //Capturamos la respuesta del usuario

                        //Almacenamos el resultado de la suma en una variable
                        resultado = multiplicar(num1, num2);
                        //Mostramos por pantalla
                        System.out.println("El resultado de multiplicar los numeros " + num1 + " y " + num2 + " es: " + resultado);
                        break;
                    case 4:
                    //Dividir
                        System.out.println("Has seleccionado la opcion de dividir.");
                        System.out.println("Introduce el primer numero: ");
                        num1 = sc.nextFloat(); //Capturamos la respuesta del usuario
                        System.out.println("Introduce el segundo número: ");
                        num2 = sc.nextFloat(); //Capturamos la respuesta del usuario

                        //Almacenamos el resultado de la suma en una variable
                        resultado = dividir(num1, num2);
                        //Mostramos por pantalla
                        System.out.println("El resultado de dividir los numeros " + num1 + " y " + num2 + " es: " + resultado);
                        break;
                    default:
                    System.out.println("Has introducido un numero que no esta en el listado. El programa va a finalizar.");
                        break;
                }
            } while ((respuesta > 0) && (respuesta < 5));   
        } catch (Exception e) {
            //Error en la introduccion de numeros
            System.out.println("Ha ocurrido un error a la hora de capturar los datos.Por favor, utilice solo números.");
        }
        finally {
            // Código que se ejecutará siempre, independientemente de si hay un error o no
            System.out.println("Ha ocurrido un error y el programa debe cerrarse.");
        }
    }
}
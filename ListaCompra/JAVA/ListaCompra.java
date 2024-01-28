package JAVA;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ListaCompra
 */
public class ListaCompra {

    public static void main(String[] args) {

        //Encerramos el scanner en un try-catch para gestionar los posibles errores
        try(Scanner sc = new Scanner(System.in)) {
            //Variables
            int respuesta = 0;
            ArrayList<String> listaDeCompras = new ArrayList<>();
            String introElem = "";


            do {
                System.out.println("|----------------------|");
                System.out.println("|1. Insertar elemento. |");
                System.out.println("|2. Borrar elemento.   |");
                System.out.println("|3. Mostrar elementos. |");
                System.out.println("|4. Salir del programa.|");
                System.out.println("|----------------------|");
                respuesta = sc.nextInt();

                switch (respuesta) {
                    case 1:
                        //Insertar
                        //Pedimos al usuario que introduzca un elemento a la lista
                        System.out.println("Has seleccionado la opcion de introducir un elemento.");
                        System.out.println("Introduce un elemento al listado: ");
                        sc.nextLine();
                        introElem = sc.nextLine();//Capturamos el elemento
                        //Lo insertamos en el array
                        listaDeCompras.add(introElem);
                        System.out.println("El elemento ha sido introducido con éxito");//Mensaje de que ha tenido exito
                    break;
                    case 2:
                        //Eliminar
                        //Primero le mostramos la lista para que vea que puede borrar
                        for(String elemento:listaDeCompras){
                            System.out.println(elemento);
                        }
                        //Ahora le preguntamos que desea borrar
                        System.out.println("Escribe el elemento que deseas borrar de la lista:");
                        sc.nextLine();
                        introElem= sc.nextLine();
                        listaDeCompras.remove(introElem); //Eliminamos
                        System.out.println("El elemento ha sido eliminado con exito.");
                    break;
                    case 3:
                        //Mostrar elementos
                        for(String elemento:listaDeCompras){
                            System.out.println(elemento);
                        }
                    break;
                    case 4:
                        //Salir
                        System.out.println("El programa ha finalizado.");
                    break;
                    default:
                        System.out.println("El numero introducido esta fuera del rango permitido, por favor introduce un numero del 1-4.");
                        System.out.println("El programa ha finalizado.");
                    break;
                }

            } while ((respuesta > 0) && (respuesta < 5));

        } catch (Exception e) {
            System.out.println("Por favor, introduce solamente números del 1-4.");
        }

    }
}
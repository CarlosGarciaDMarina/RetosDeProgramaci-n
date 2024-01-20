/*              LA SUCESIÓN DE FIBONACCI
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */ 
//Include
#include <iostream>

//Usos
using namespace std;

int main(int argc, char const *argv[])
{
    //Inicializamos las variables
    int num = 50;
    long primero = 0;
    long segundo = 1;

    //Mostramos por pantalla al usuario lo que vamos a imprimir
    cout << "Los primeros " << num << " números de la sucesión de Fibonacci: " << endl;
    for (int i = 0; i < num; i++)
    {
        cout << primero << " ";

        //Calculamos los siguientes numeros sumando los dos anteriores
        long siguiente = primero + segundo;

        //Actualizamos los terminos para la siguiente vuelta del bucle
        primero = segundo;
        segundo = siguiente;
    }

    return 0;
}


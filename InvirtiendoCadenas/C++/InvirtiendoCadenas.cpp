/*      Invirtiendo Cadenas
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
#include <iostream>
#include <string>
using namespace std;

int main(int argc, char const *argv[])
{
    //Inicializamos las variables
    int i = 0;
    int j = 0;
    string cadena[] = {"Hola", "Mundo"};
    string cadenaInvertida = "";

    //Creamos el bucle que va a recorrer el array a la inversa
    for (i = sizeof(cadena) / sizeof(cadena[0]) - 1; i >= 0; i--)
    {
        //Creamos la variable de la palabra invertida
        string palabraInvertida = "";

        //Este bucle recorre cada letra de la palabra actual (cadena[i]) de manera inversa.
        for (j = cadena[i].length() -1; j >= 0; j--)
        {
            //Almacenamos en la funcion cada letra dentro de la cadena cadena[i] acaba siendo la ultima posicion del array y cadena [j] acaba siendo la ultima posicion de la ultima palabra del array
            palabraInvertida += cadena[i][j];
        }
        //Agregamos la palabra invertida a la variable cadena invertida dejando un pequeño espacio para mayor legibilidad
        cadenaInvertida += palabraInvertida + " ";
    }
    
    //Imprimimos por pantalla
    cout << cadenaInvertida << endl;

    return 0;
}
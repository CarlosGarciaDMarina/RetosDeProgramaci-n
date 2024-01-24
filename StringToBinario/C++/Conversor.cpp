/*
 * Crea un programa se encargue de transformar una cadena de texto a binario 
 * sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
#include<iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    //Creamos las variables que vamos a necesitar para realizar el ejercicio
    string cadena[] = {"Hola mundo"};
    int numElementos = sizeof(cadena) / sizeof(cadena[0]);
    string cadenaConvertida = "";

    //Creamos un bucle que recorra la palabra
    for(int i = 0; i < numElementos; i++)
    {
        /* y otro que recorra las letras */
        for (int j = 0; j < cadena[i].length(); j++)
        {
            //Creamos un condicional que cada vez que identifique una vocal en la palabra, la convierta en 1
            if ((cadena[i][j] == 'a') || (cadena[i][j] == 'e') || (cadena[i][j] == 'i') || 
                (cadena[i][j] == 'o') || (cadena[i][j] == 'u')) 
            {
                cadenaConvertida += "1";     
            } 
            else 
            {
               //En caso contrario será un 0
                cadenaConvertida += "0";
            }
        }      
    }
    //Imprimimos el resultado
    cout << cadenaConvertida << endl;

    return 0;
}
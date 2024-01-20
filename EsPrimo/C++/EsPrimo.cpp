/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
#include <iostream>

using namespace std;

//Funcion
//Esta funcion determina si un numero es primo
bool esPrimo(int num){
    return num % 2 == 1;
}

//Main
int main(int argc, char const *argv[])
{
    //Inicializamos las variables que necesitamos
    int i = 0;
    int num = 0;

    //Pedimos al usuario un numero
    cout << "Dame un numero y te dire si es primo: " << endl;
    cin >> num;

    //Establecemos las condiciones
    if (esPrimo(num))
    {
        cout << "El numero " << num << " es un numero primo." << endl;
    } 
    else
    {
        cout << "El numero " << num << " no es un numero primo." << endl;
    }

    cout << "Vamos a mostrar todos los numeros primos entre el 1 y el 100" << endl;

    //Hacemos un bucle para imprimir todos los numeros del 1 al 100
    for ( i = 0; i < 101; i++)
    {
        if (esPrimo(i))
        {
            cout << i << endl;
        }
    }
    return 0;
}
/*          FIZZBUZZ
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

//Usos
#include <iostream>
using namespace std;

//Funciones
//Funcion para saber si el numero es multiplo de 3
bool fizz(int num){
    return num % 3 == 0;
}

//Funcion para saber si el numero es multiplo de 5
bool buzz(int num){
    return num % 5 == 0;
}

//Funcion para saber si el numero es multiplo de 3 y de 5
bool fizzBuzz(int num){
    if ((num % 3 == 0) && (num % 5 == 0))
    {
        return true;
    }else
    {
        return false;
    }
    
    
}


int main(int argc, char const *argv[])
{
    /* Bucle que recorre los numeros del 1 al 100 */
    for (int i = 1; i < 101; i++)
    {
        //Condicionales para resolver el ejercicio
        if (fizzBuzz(i)==true)
        {
            cout << "FizzBuzz" << endl;
            cout << endl;
        }
        else if (buzz(i)==true)
        {
            cout << "Buzz" << endl;
            cout << endl;

        }
        else if (fizz(i)==true)
        {
            cout << "Fizz" << endl;
            cout << endl;

        }
        else
        {
            cout << i << endl;
        }
        
        
    }
    return 0;
}

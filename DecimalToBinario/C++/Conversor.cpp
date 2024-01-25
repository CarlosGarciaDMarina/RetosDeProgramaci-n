/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
#include <iostream>
#include <sstream>
#include <algorithm> // Necesario para la función reverse

using namespace std;

int main() {
    // Variables
    long decimal = 0;
    long resto = 0;

    // Pedimos al usuario un número decimal
    cout << "Este programa convierte un numero decimal a binario. Ingrese un numero: ";
    cin >> decimal;

    // Utilizamos ostringstream para construir la cadena binaria
    ostringstream binario;
    while (decimal > 0) {
        resto = decimal % 2;
        binario << resto; // Insertamos el resto al final de la cadena
        decimal /= 2;
    }

    // Obtenemos la cadena de binario
    string binary = binario.str();

    // Invertimos la cadena para poder leerlo correctamente
    reverse(binary.begin(), binary.end());

    // Imprimimos el resultado
    cout << "El numero binario resultante es: " << binary << endl;

    return 0;
}
#include <iostream>
#include <algorithm>

//Usos
using namespace std;

//Funciones
//Esta funcion determina si dos palabras son anagramas
bool sonAnagramas(const string& palabra1, const string& palabra2) {
    // Copiamos las palabras originales para no modificarlas directamente
    string copiaPalabra1 = palabra1;
    string copiaPalabra2 = palabra2;

    // Transformamos todas las letras de las palabras a minúsculas
    transform(copiaPalabra1.begin(), copiaPalabra1.end(), copiaPalabra1.begin(), ::tolower);
    transform(copiaPalabra2.begin(), copiaPalabra2.end(), copiaPalabra2.begin(), ::tolower);

    // Ordenamos alfabéticamente las letras de ambas palabras
    sort(copiaPalabra1.begin(), copiaPalabra1.end());
    sort(copiaPalabra2.begin(), copiaPalabra2.end());

    // Comparamos las palabras ordenadas. Si son iguales, las palabras originales son anagramas.
    return copiaPalabra1 == copiaPalabra2;
}

int main() {
    // Variables para almacenar las palabras ingresadas por el usuario
    string palabra1, palabra2;

    // Solicitamos al usuario que ingrese las dos palabras
    cout << "Ingresa la primera palabra: ";
    cin >> palabra1;
    cout << "Ingresa la segunda palabra: ";
    cin >> palabra2;

    // Llamamos a la función sonAnagramas y mostramos el resultado
    bool resultado = sonAnagramas(palabra1, palabra2);
    cout << (resultado ? "Son anagramas." : "No son anagramas.") << endl;

    // Indicamos que el programa se ejecutó correctamente
    return 0;
}
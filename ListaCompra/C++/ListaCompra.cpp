#include <iostream>
#include <vector>
#include <string>
#include <algorithm>  // Necesario para la función find

using namespace std;

// Funciones
void eliminarElemento(vector<string> &miVector, const string &elementoAEliminar)
{
    // Mostrar el vector antes de la eliminación
    cout << "Vector antes de la eliminación: ";
    for (const auto &elemento : miVector)
    {
        cout << elemento << " ";
    }
    cout << endl;

    // Buscar el elemento en el vector
    auto it = find(miVector.begin(), miVector.end(), elementoAEliminar);

    // Verificar si el elemento fue encontrado
    if (it != miVector.end())
    {
        // Eliminar el elemento si fue encontrado
        miVector.erase(it);

        // Mostrar el vector después de la eliminación
        cout << "Vector después de la eliminación: ";
        for (const auto &elemento : miVector)
        {
            cout << elemento << " ";
        }
        cout << endl;
    }
    else
    {
        cout << "El elemento a eliminar no fue encontrado." << endl;
    }
}

int main()
{
    vector<string> listaCompra;
    int respuesta = 0;
    string introElem = "";

    do
    {
        cout << "|-----------------------|" << endl;
        cout << "|1. Introducir elemento.|" << endl;
        cout << "|2. Borrar elemento.    |" << endl;
        cout << "|3. Mostrar listado.    |" << endl;
        cout << "|4. Salir del programa. |" << endl;
        cout << "|-----------------------|" << endl;
        cin >> respuesta; // Capturamos la respuesta

        switch (respuesta)
        {
        case 1:
            // Introducir un elemento
            cout << "Has seleccionado la opcion de introducir un elemento en la lista." << endl;
            cout << "Introduce el elemento: ";
            cin.ignore();  // Ignorar el salto de línea pendiente
            getline(cin, introElem);
            // metemos el elemento
            listaCompra.push_back(introElem);
            cout << "El elemento '" << introElem << "' ha sido introducido con exito." << endl;
            break;
        case 2:
            // Elimina un elemento
            cout << "Has seleccinado la opcion de eliminar un elemento de la lista." << endl;
            // Mostramos la lista de la compra
            for (string elemento : listaCompra)
            {
                cout << elemento << endl;
            }
            cout << "¿Que elemento deseas borrar?" << endl;
            cin.ignore();  // Ignorar el salto de línea pendiente
            getline(cin, introElem);
            // Eliminamos
            eliminarElemento(listaCompra, introElem);
            // Mostramos mensaje de que el elemento fue eliminado con éxito
            cout << "El elemento '" << introElem << "' se ha borrado con exito." << endl;
            break;
        case 3:
            // Mostramos la lista de la compra
            for (string elemento : listaCompra)
            {
                cout << elemento << endl;
            }
            break;
        case 4:
        //Salir
            cout << "El programa ha finalizado." << endl;
        default:
            cout << "Has introducido un elemento fuera de rango, el programa ha finalizado." << endl;
            break;
        }
    } while (respuesta > 0 && respuesta < 5);

    return 0;
}

#include <iostream>

using namespace std;

//Funciones
//Esta funcion es una funcion que te devuelve el area de un poligono
float areaPoligono(int opcion, float altura, float base, float lado){
    //Declaramos la variable que se va a encargar de almacenar el resultado de las operaciones
    float resultado = 0.0f;

    //Creamos los condicionales
    if (opcion == 1)
    {
        /* triangulo */
        resultado = (base * altura) / 2;
        return resultado;
    }
    else if (opcion == 2)
    {
        /* cuadrado */
       resultado = lado * lado;
        return resultado;
    }
    else if (opcion == 3)
    {
        /* rectangulo */
        resultado = base * altura;
        return resultado;
    }    
    else
    {
        /* Error */
        cout << "Has introducido letras o algún numero que no esta comprendido entre el 1 y el 3" << endl;
        return 0;
    }
}

int main(int argc, char const *argv[])
{
    // Inicializamos las variables
    int resultado = 0;
    int respuesta = 0;
    float base = 0.0f;
    float lado = 0.0f;
    float altura = 0.0f;

    do
    {
        // Mostramos la consola al usuario
        cout << "|---------------|" << endl;
        cout << "|0. Salir.      |" << endl;
        cout << "|1. Triangulo.  |" << endl;
        cout << "|2. Cuadrado.   |" << endl;
        cout << "|3. Rectangulo. |" << endl;
        cout << "|---------------|" << endl;
        cout << "Selecciona una opcion del menu" << endl;
        cin >> respuesta;

        switch (respuesta)
        {
        case 1:
            /* Triángulo */
            //Pedimos los parametros al usuario
            cout << "Has seleccionado la opcion del triangulo." << endl;
            cout << "Dame su base:" << endl;
            cin >> base;
            cout << "Dame su altura:" << endl;
            cin >> altura;
            //Realizamos la operacion y la guardamos en la variable resultado
            resultado = areaPoligono(1, altura, base, lado);
            //Imprimimos por pantalla el resultado
            cout << "El area del triangulo es " << resultado << endl;
            break;

        case 2:
            /* Cuadrado */
            //Pedimos los parametros al usuario
            cout << "Has seleccionado la opcion del cuadrado." << endl;
            cout << "Dame su lado:" << endl;
            cin >> lado;
            //Realizamos la operacion y la guardamos en la variable resultado
            resultado = areaPoligono(2, altura, base, lado);
            //Imprimimos por pantalla el resultado
            cout << "El area del cuadrado es " << resultado << endl;
            break;

        case 3:
            /* Rectángulo */
            //Pedimos los parametros al usuario
            cout << "Has seleccionado la opcion del rectangulo." << endl;
            cout << "Dame su base:" << endl;
            cin >> base;
            cout << "Dame su altura:" << endl;
            cin >> altura;
            //Realizamos la operacion y la guardamos en la variable resultado
            resultado = areaPoligono(3, altura, base, lado);
            //Imprimimos por pantalla el resultado
            cout << "El area del rectangulo es " << resultado << endl;
            break;

        default:
        cout << "Ha elegido una opcion que no esta en el menú, el programa va a finalizar." << endl;
            break;
        }

    } while ((respuesta > 0) && (respuesta < 4));
    
    return 0;
}

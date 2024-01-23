/*
 * Calculadora
 * crea una calculadora con interfaz utlizando las minimas lineas de codigo posibles
 * que sea modular
 * EXTRA: Gestion de errores
 */
#include <iostream>
using namespace std;

//Funciones
//Funcion para sumar
float sumar(float num1, float num2)
{
    return num1 + num2;
}
//Funcion para restar
float restar(float num1, float num2)
{
    return num1 - num2;
}
//Funcion para multiplicar
float multiplicar(float num1, float num2)
{
    return num1 * num2;
}
//Funcion para dividir
float dividir(float num1, float num2)
{
    //Gestion de errores
    if ((num1 == 0) || (num2 == 0))
    {
        /* error */
        throw runtime_error("Error de division por cero");
    }
    else
    {
        return num1 / num2;
    }
}

int main(int argc, char const *argv[])
{
    //Variables
    int respuesta = 0;
    int resultado = 0;
    float num1 = 0;
    float num2 = 0;

    //Gestion de errores
    try
    {
        cout << "|-----------------------|" << endl;
        cout << "|0. Salir.              |" << endl;
        cout << "|1. Sumar.              |" << endl;
        cout << "|2. Restar.             |" << endl;
        cout << "|3. Multiplicar.        |" << endl;
        cout << "|4. Dividir.            |" << endl;
        cout << "|-----------------------|" << endl;
        cout << "Elige una opcion del menu: " << endl;
        cin >> respuesta;

        do
        {
            /* code */
            switch (respuesta)
            {
            case 0:
                /* Salir */
                cout << "El programa va a finalizar." << endl;
                break;
            case 1:
                /* Sumar */
                cout << "Has elegido la opcion de sumar." << endl;
                cout << "Introduce el primer numero: " << endl;
                cin >> num1;
                cout << "Introduce el segundo numero: " << endl;
                cin >> num2;
                //Almacenamos el resultado e imprimimos
                resultado = sumar(num1, num2);
                cout << "El resultado de sumar los numeros " << num1 << " y " << num2 << " es: " << resultado << endl;
                break;
            case 2:
                /* Restar */
                cout << "Has elegido la opcion de restar." << endl;
                cout << "Introduce el primer numero: " << endl;
                cin >> num1;
                cout << "Introduce el segundo numero: " << endl;
                cin >> num2;
                //Almacenamos el resultado e imprimimos
                resultado = restar(num1, num2);
                cout << "El resultado de restar los numeros " << num1 << " y " << num2 << " es: " << resultado << endl;
                break;
            case 3:
                /* Multiplicar */
                cout << "Has elegido la opcion de multiplicar." << endl;
                cout << "Introduce el primer numero: " << endl;
                cin >> num1;
                cout << "Introduce el segundo numero: " << endl;
                cin >> num2;
                //Almacenamos el resultado e imprimimos
                resultado = multiplicar(num1, num2);
                cout << "El resultado de multiplicar los numeros " << num1 << " y " << num2 << " es: " << resultado << endl;
                break;
            case 4:
                /* Dividir */
                cout << "Has elegido la opcion de dividir." << endl;
                cout << "Introduce el primer numero: " << endl;
                cin >> num1;
                cout << "Introduce el segundo numero: " << endl;
                cin >> num2;
                //Almacenamos el resultado e imprimimos
                resultado = dividir(num1, num2);
                cout << "El resultado de dividir los numeros " << num1 << " y " << num2 << " es: " << resultado << endl;
                break;
            default:
                break;
            }
        } while ((respuesta > 0) && (respuesta < 5));
    }
    catch(const std::exception& e)
    {
        cout << "Ha ocurrido un error y el programa va a finalizar." << endl;
    }
 return 0;
}

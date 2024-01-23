# Calculadora
# crea una calculadora con interfaz utlizando las minimas lineas de codigo posibles
# que sea modular
# EXTRA: Gestion de errores
#Funciones
#Funcion para sumar
def sumar(num_1, num_2):
    return num_1 + num_2

#Funcion para restar
def restar(num_1, num_2):
    return num_1 - num_2

#Funcion para multiplicar
def multiplicar(num_1, num_2):
    return num_1 * num_2

#Funcion para dividir
def dividir(num_1, num_2):
    if num_2 == 0:
        return "Error de division por cero"
    else:
        return num_1 / num_2

# Preguntamos al usuario qué función quiere realizar
print("|-----------------------|")
print("|0. Salir.              |")
print("|1. Sumar.              |")
print("|2. Restar.             |")
print("|3. Multiplicar.        |")
print("|4. Dividir.            |")
print("|-----------------------|")
respuesta = int(input("Elige una opcion del menu:")) #Almacenamos la respuesta en una variable

# Creamos las condiciones
if respuesta == 1:
    #Sumar
    print("Has elegido la opcion de sumar.")
    num_1 = float(input("Introduce el primer numero: "))
    num_2 = float(input("Introduce el segundo numero: "))
    # Almacenamos el resultado y lo mostramos por pantalla
    resultado = sumar(num_1, num_2)
    print(f"El resultado de sumar los numeros {num_1} y {num_2} es: {resultado}")
elif respuesta == 2:
    #Restar
    print("Has elegido la opcion de restar.")
    num_1 = float(input("Introduce el primer numero: "))
    num_2 = float(input("Introduce el segundo numero: "))
    # Almacenamos el resultado y lo mostramos por pantalla
    resultado = restar(num_1, num_2)
    print(f"El resultado de restar los numeros {num_1} y {num_2} es: {resultado}")
elif respuesta == 3:
    #Multiplicar
    print("Has elegido la opcion de multiplicar.")
    num_1 = float(input("Introduce el primer numero: "))
    num_2 = float(input("Introduce el segundo numero: "))
    # Almacenamos el resultado y lo mostramos por pantalla
    resultado = multiplicar(num_1, num_2)
    print(f"El resultado de multiplicar los numeros {num_1} y {num_2} es: {resultado}")
elif respuesta == 4:
    #Dividir
    print("Has elegido la opcion de dividir.")
    num_1 = float(input("Introduce el primer numero: "))
    num_2 = float(input("Introduce el segundo numero: "))
    # Almacenamos el resultado y lo mostramos por pantalla
    resultado = dividir(num_1, num_2)
    print(f"El resultado de dividir los numeros {num_1} y {num_2} es: {resultado}")
elif respuesta == 0:
    #Salir
    print("El programa ha finalizado.")
else:
    print("Has introducido un numero que no está en la lista o algún caracter.")

# FIZZBUZZ
# Escribe un programa que muestre por consola (con un print) los
# números de 1 a 100 (ambos incluidos y con un salto de línea entre
# cada impresión), sustituyendo los siguientes:
# - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
# - Múltiplos de 3 por la palabra "fizz".
# - Múltiplos de 5 por la palabra "buzz".

#Funciones
#funcion para saber si un numero es multiplo de 3 
def fizz (num):
    return num % 3 == 0

#Funcion que determina si un numero es multiplo de 5
def buzz(num):
    return num % 5 == 0

#Funcion due determina si un numero es multiplo de 3 y 5 a la vez
def fizzBuzz(num):
    return (num % 3 == 0) and (num % 5 == 0)

#Creamos el bucle que recorre desde el 1 hasta el 100 
for i in range(1, 101):
    #Establecemos los condicionales para determinar los objetivos del ejercicio
    if fizzBuzz(i):
        print("FizzBuzz")
    elif buzz(i):
        print("Buzz")
    elif fizz(i):
        print("Fizz")
    else:
        print(i)


    
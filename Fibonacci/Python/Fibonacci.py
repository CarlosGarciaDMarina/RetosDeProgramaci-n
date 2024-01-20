#       Secuencia Fibonacci
#   Escribe un programa que imprima los 50 primeros números de la sucesión
#   de Fibonacci empezando en 0.
#   La serie Fibonacci se compone por una sucesión de números en
#   la que el siguiente siempre es la suma de los dos anteriores.
#   0, 1, 1, 2, 3, 5, 8, 13...
# 

#Iicializamos las variables
n = 50
primero = 0
segundo = 1

#Mostramos por pantalla al usuario lo que vamos a imprimir
print("Los primeros " + str(n) + " numeros de la secuencia de Fibonacci son: ")
for i in range(n):
    print(primero, end=" ")

    #Calculamos el siguiente numero
    siguiente = primero + segundo
    
    #Actualizamos los terminos para el siguiente ciclo
    primero = segundo
    segundo = siguiente

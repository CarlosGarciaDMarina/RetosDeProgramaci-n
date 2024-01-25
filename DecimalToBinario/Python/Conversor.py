#Crea un programa se encargue de transformar un número
#decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
#Pedimos al usuario un numero para empezar el programa
decimal = int(input("Este programa tranforma un numero decimal a binario, dame un numero decimal: "))
#Inicializamos la cadena binaria
binario = ''
#Gestion de errores
if decimal == 0:
    binario = 0
else:
    #Bucle para convertir el numero decimal a binario
    while decimal > 0:
        resto = decimal % 2 #Calculamos el residuo
        binario = str(resto) + binario #Colocamos el residuo al principio 
        decimal //= 2 #Actualizamos el numero decimal dividiendolo por 2
#Imprimimos por pantalla
print("El resultado de la conversion es: ", binario)
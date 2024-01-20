#   ES PRIMO????
# Escribe un programa que se encargue de comprobar si un número es o no primo.
# Hecho esto, imprime los números primos entre 1 y 100.
def esPrimo(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

#Preguntamos al usuario por un número
num = int(input("Dame un número y te digo si es primo: "))

#Verificamos si el número es primo y mostramos el resultado
if esPrimo(num):
    print(f"El número {num} es un número primo.")
else:
    print(f"El número {num} no es un número primo.")

print("Números primos entre 1 y 100:")

#Mostramos los números primos entre 1 y 100
for i in range(2, 101):
    if esPrimo(i):
        print(i)
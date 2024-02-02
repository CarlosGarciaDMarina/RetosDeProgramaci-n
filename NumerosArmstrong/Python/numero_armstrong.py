'''
NumerosArmstong
Escribe una función que calcule si un número dado es un número de Armstrong
(o también llamado narcisista).
Si no conoces qué es un número de Armstrong, debes buscar información
al respecto. 

NumerosArmstong:
1
5
9
153
370
371
407
1634
8208
9474
54748
92727
93084
548834
1741725
'''
# Función para verificar si un número es un número de Armstrong
def es_armstrong(num):
    # Convertimos el número a una cadena para trabajar con los dígitos
    num_cadena = str(num)
    # Calculamos el número de dígitos en el número
    num_digitos = len(num_cadena)
    # Calculamos la suma de los cubos de los dígitos elevados al número total de dígitos
    sum_cubos = sum(int(digit) ** num_digitos for digit in num_cadena)
    # Devolvemos True si la suma de los cubos es igual al número original, False en caso contrario
    return sum_cubos == num

# Pedimos al usuario que ingrese un número
num = int(input("Dame un número para saber si es Armstrong: ")) 

# Verificamos si el número es un número de Armstrong
if es_armstrong(num):
    print(f"Sí, el número {num} es un número de Armstrong.")
else:
    print(f"No, el número {num} no es un número de Armstrong.")


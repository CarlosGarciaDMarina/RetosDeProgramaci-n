#      Invirtiendo Cadenas
# Crea un programa que invierta el orden de una cadena de texto
# sin usar funciones propias del lenguaje que lo hagan de forma automática.
# - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
# 
#Inicializamos las variables
i = 0
j= 0
cadena = ["Hola", "Mundo"]
longitudCadena = len(cadena) #Usamos la funcion len para obtener la longitud de una lista
cadenaInvertida = ""

#Creamos el bucle for que recorrera el array al reves
for i in range(longitudCadena -1, -1, -1):
    #Usamos len de nuevo para almacenar la longitud de la nueva cadena
    longitudDos = len(cadena[i])
    palabraInvertida = ""

    #Este bucle recorre cada letra de la palabra actual (cadena[i]) de manera inversa.
    for j in range(longitudDos -1, -1, -1):
        #Almacenamos en la funcion cada letra dentro de la cadena cadena[i] acaba siendo la ultima posicion del array y cadena [j] acaba siendo la ultima posicion de la ultima palabra del array
        palabraInvertida += cadena[i][j]
    #Agregamos la palabra invertida a la variable cadena invertida dejando un pequeño espacio para mayor legibilidad
    cadenaInvertida += palabraInvertida + " "
#Imprimimos el resultado
print(cadenaInvertida)
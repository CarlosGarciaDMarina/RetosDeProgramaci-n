#       
#   Crea un programa se encargue de transformar una cadena de texto a binario 
#   sin utilizar funciones propias del lenguaje que lo hagan directamente.
#
#Creamos las variables que vamos a utilizar 
cadena = ["Hola mundo"]
vocales = ['a', 'e', 'i', 'o', 'u']
cadena_convertida = ""

# Recorremos las palabras en la lista
for palabra in cadena:
    # Inicializamos la cadena para cada palabra
    palabra_convertida = ""
    
    # Recorremos las letras de cada palabra
    for letra in palabra:
        # Verificamos si la letra es una vocal
        if letra.lower() in vocales:
            palabra_convertida += "1"
        else:
            palabra_convertida += "0"
    
    # Agregamos la palabra convertida a la cadena general
    cadena_convertida += palabra_convertida + " "

# Imprimimos la cadena convertida
print(cadena_convertida)

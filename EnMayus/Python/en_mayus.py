"""
                        EnMayuscula
  Crea una función que reciba un String de cualquier tipo y se encargue de
  poner en mayúscula la primera letra de cada palabra.
  - No se pueden utilizar operaciones del lenguaje que lo resuelvan
  directamente.
"""
def en_mayuscula(frase):
    palabras = frase.split()  # Dividir la frase en palabras
    palabras_modificadas = []

    for palabra in palabras:
        palabra_modificada = palabra[0].upper() + palabra[1:]
        palabras_modificadas.append(palabra_modificada)

    resultado = ' '.join(palabras_modificadas)
    return resultado

# Preguntar al usuario por una palabra o frase
entrada_usuario = input("Introduce una palabra o frase: ")

# Aplicar la función
resultado_final = en_mayuscula(entrada_usuario)

# Mostrar el resultado
print(resultado_final)


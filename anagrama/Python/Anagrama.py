#          ANAGRAMA
# Escribe una función que reciba dos palabras (String) y retorne
# verdadero o falso (Bool) según sean o no anagramas.
# - Un Anagrama consiste en formar una palabra reordenando TODAS
#   las letras de otra palabra inicial.
# - NO hace falta comprobar que ambas palabras existan.
# - Dos palabras exactamente iguales no son anagrama.

#Definimos la funcion que se va a encargar de comprobarlo
def esAnagrama(palabra, palabra_2):
    #Si una de las palabras es mas corta o mas larga que la otra retorna false pues no serian anagramas
    if len(palabra) != len(palabra_2):
        return False
    else : 
        # Ordenamos las letras de ambas palabras y comparamos si son iguales
        return sorted(palabra) == sorted(palabra_2)

#Avisamos al usuario 
print("Esta funcion determina si dos palabras son anagramas.")

#Definimos las variables a comprobar y pedimos al usuario que nos de las palabras
palabra = input("Dame la primera palabra: ")
palabra_2 = input("Dame la segunda palabra: ")

if esAnagrama(palabra, palabra_2):
    print("Si, son anagramas.")
else:
    print("No, no son anagramas.")
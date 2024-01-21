#       Area Poligono
# Crea una única función (importante que sólo sea una) que sea capaz
# de calcular y retornar el área de un polígono.
# - La función recibirá por parámetro sólo UN polígono a la vez.
# - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
# - Imprime el cálculo del área de un polígono de cada tipo.
# 

#Funciones
#Esta funcion calcula el area de un poligono
def area_poligono(opcion, altura, base, lado):
    #Creamos la variable
    resultado = 0

    #Creamos los condicionales
    if opcion == 1:
        #Triangulo
        resultado = (base * altura) / 2
        return resultado
    if opcion == 2:
        #Cuadrado
        resultado = lado * lado
        return resultado
    if opcion == 3:
        #Rectangulo
        resutlado = base * altura
        return resultado
    else:
        #Error
        return 0

#Creamos las variables
resultado = 0
respuesta = 0
altura = 0
base = 0
lado = 0

#Mostramos la consola
print("|-------------------|")
print("|0. Salir           |")
print("|1. Triangulo       |")
print("|2. Cuadrado        |")
print("|3. Rectangulo      |")
print("|-------------------|")
respuesta = input("Selecciona una opcion del menu:")


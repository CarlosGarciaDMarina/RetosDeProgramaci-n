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
    elif opcion == 2:
        #Cuadrado
        resultado = lado * lado
        return resultado
    elif opcion == 3:
        #Rectangulo
        resultado = base * altura
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

#convertimos la respuesta a entero
respuesta = int(input("Selecciona una opcion del menu:"))

#Creamos los condicionales
if respuesta == 0:
    #Salir
    print("El programa ha finalizado.")
elif respuesta == 1:
    #Triangulo
    print("Has seleccionado la opcion del triangulo.")
    base = float(input("Dame la base del triangulo:"))
    altura = float(input("Dame la altura del triangulo:"))
    resultado = area_poligono(1, altura, base, lado)
    print("El area del triangulo es " + str(resultado))

elif respuesta == 2:
    #Cuadrado
    print("Has seleccionado la opcion del cuadrado.")
    lado = float(input("Dame el lado del cuadrado:"))
    resultado = area_poligono(2, altura, base, lado)
    print("El area del cuadrado es " + str(resultado))
elif respuesta == 3:
    #Rectangulo
    print("Has seleccionado la opcion del rectangulo.")
    base = float(input("Dame la base del rectangulo:"))
    altura = float(input("Dame la altura del rectangulo:"))
    resultado = area_poligono(3, altura, base, lado)
    print("El area del rectangulo es " + str(resultado))
else:
    #Error
    print("La opcion seleccionada no existe, por favor, utiliza numero del 0 al 3 y no uses letras.")
# Reto: Lista de la Compra
#
# Crea un programa que simule una lista de la compra. El programa debe permitir al usuario agregar elementos a la lista, eliminar elementos y 
# mostrar la lista completa. Además, debería verificar si un artículo ya está en la lista antes de agregarlo nuevamente.
# Puedes implementar esto en cualquier lenguaje de programación que prefieras. Siéntete libre de agregar funciones adicionales según lo consideres necesario.
# Variables
lista_compra = []
salir = True

while salir:
    print("|-----------------------|")
    print("|1. Introducir elemento.|")
    print("|2. Borrar elemento.    |")
    print("|3. Mostrar listado.    |")
    print("|4. Salir del programa. |")
    print("|-----------------------|")
    opcion = int(input("Introduce una opción de la consola:"))

    if opcion == 1:
        # Introducimos el elemento
        print("Has seleccionado la opcion de introducir un elemento")
        intro_elem = input("Introduce el elemento: ")
        if intro_elem not in lista_compra:
            lista_compra.append(intro_elem)
            print(f"{intro_elem} agregado a la lista.")
        else:
            print(f"{intro_elem} ya está en la lista.")
    elif opcion == 2:
        print("Has seleccionado la opcion de eliminar un elemento")
        intro_elem = input("Introduce el elemento que deseas eliminar: ")
        if intro_elem in lista_compra:
            lista_compra.remove(intro_elem)
            print(f"{intro_elem} eliminado de la lista.")
        else:
            print(f"{intro_elem} no existe en la lista.")
    elif opcion == 3:
        print("Lista de compras:")
        for elemento in lista_compra:
            print(elemento)
    elif opcion == 4:
        print("El programa ha finalizado.")
        salir = False
        break
    else:
        print("Introduce una opcion valida")





def ordenar_matriz(lista, orden):
    n = len(lista)
    
    # Algoritmo de burbuja
    for i in range(n):
        for j in range(0, n-i-1):
            if (orden == "Asc" and lista[j] > lista[j+1]) or (orden == "Desc" and lista[j] < lista[j+1]):
                lista[j], lista[j+1] = lista[j+1], lista[j]
    
    return lista

# Ejemplos de uso
lista = [2, 4, 6, 8, 9]
print(ordenar_matriz(lista, "Asc"))  # Salida: [2, 4, 6, 8, 9]
print(ordenar_matriz(lista, "Desc")) # Salida: [9, 8, 6, 4, 2]

def imprimir_x(tamaño):
    # Nos aseguramos de que el tamaño sea siempre par para que la x sea simétrica
    if tamaño % 2 == 0:
        # Incrementamos el tamaño
        tamaño+=1 
    # Recorremos las filas segun el tamaño indicado
    for i in range(tamaño):
        fila = ""
        # Recorremos las columnas segun el tamaño indicado
        for j in range(tamaño):
            # Verificamos si estamos en la posicion correcta para pintar la "x" o el " "
            if j == i or j == tamaño -1 -i:
                # Pintamos la x
                fila += "x"
            else:
                # Dejamos un hueco
                fila += " ";
        # Imprimimos la variable
        print(fila)
# Imprimimos la x
imprimir_x(15)

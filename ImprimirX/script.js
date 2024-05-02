function imprimirX(tamaño) {
    // Nos aseguramos de que el tamaño sea siempre par para que la x sea simétrica 
    if (tamaño % 2 === 0) {
        tamaño++; // Ajustamos el tamaño a un número impar para una X simétrica
    }
    // Recorremos las filas segun el tamaño indicado
    for (let i = 0; i < tamaño; i++) {
        let fila = "";
        // Recorremos las columnas segun el tamaño indicado
        for (let j = 0; j < tamaño; j++) {
            // Verificamos si estamos en la posicion correcta para pintar la "x" o el " "
            if (j === i || j === tamaño - 1 - i) {
                fila += "x"; // Imprimimos 'x' en las posiciones diagonales
            } else {
                fila += " "; // Imprimimos un espacio en las demás posiciones
            }
        }
        console.log(fila); // Imprimimos la fila actual
    }
}

imprimirX(5); // Ajustamos el tamaño

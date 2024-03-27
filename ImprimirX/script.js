function imprimirX(tamaño) {
    if (tamaño % 2 === 0) {
        tamaño++; // Ajustamos el tamaño a un número impar para una X simétrica
    }
    for (let i = 0; i < tamaño; i++) {
        let fila = "";
        for (let j = 0; j < tamaño; j++) {
            if (j === i || j === tamaño - 1 - i) {
                fila += "x"; // Imprimimos 'x' en las posiciones diagonales
            } else {
                fila += " "; // Imprimimos un espacio en las demás posiciones
            }
        }
        console.log(fila); // Imprimimos la fila actual
    }
}

// Ejemplo de uso:
imprimirX(5); // Puedes ajustar el tamaño según lo necesites

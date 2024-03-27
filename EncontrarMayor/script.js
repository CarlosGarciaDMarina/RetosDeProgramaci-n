function encontrarMayor(arreglo) {
    let mayor = arreglo[0]; // Asignamos el primer elemento del arreglo como el mayor inicialmente
    for (let i = 1; i < arreglo.length; i++) {
        if (arreglo[i] > mayor) {
            mayor = arreglo[i]; // Actualizamos el mayor
        }
    }
    return mayor;
}

// Ejemplo de uso:
let miArreglo = [3, 7, 2, 10, 5];
console.log("El número mayor en el arreglo es:", encontrarMayor(miArreglo));

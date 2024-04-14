/**
 * NumerosArmstong
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto. 
 * 
 * NumerosArmstong:
 * 1
 * 5
 * 9
 * 153
 * 370
 * 371
 * 407
 * 1634
 * 8208
 * 9474
 * 54748
 * 92727
 * 93084
 * 548834
 * 1741725
 */

// Creamos una funcion que verifique si un número es armstrong

function esArmstrong(num) {
    // Convertimos el número a cadena para trabajar con los digitos
    let numeroCadena = num.toString();

    // Calculamos el numero digitos que tiene el numero
    let numeroDigitos = numeroCadena.length;

    // Calculamos la suma de los cubos de los dígitos elevados al número total de dígitos
    let sumCubos = Array.from(numeroCadena).reduce((acc, digit) => acc + Math.pow(parseInt(digit), numeroDigitos), 0);

    // Devolvemos True si la suma de los cubos es igual al número original, False en caso contrario
    return sumCubos === num;
}

// Pedimos al usuario que ingrese un número
let respuesta = prompt("Introduce un numero para saber si es Armstrong.");
let num = parseInt(respuesta, 10);

// Verificamos si el número es armstrong o no
if (esArmstrong(num)) {
    document.write(`Si, el número ${num} es un número de Armstrong.`);
} else {
    document.write(`No, el número ${num} no es un número de Armstrong.`);
}

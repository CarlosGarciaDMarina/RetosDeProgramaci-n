/*          ANAGRAMA
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

//Funcion
function sonAnagramas(palabra1, palabra2) {
    // Convertimos las palabras a minúsculas y luego en arrays de caracteres
    const arrPalabra1 = palabra1.toLowerCase().split("");
    const arrPalabra2 = palabra2.toLowerCase().split("");

    // Verificamos si tienen la misma longitud
    if (arrPalabra1.length !== arrPalabra2.length) {
        return false;
    } else {
        // Ahora las ordenamos
        arrPalabra1.sort();
        arrPalabra2.sort();

        // Convertimos los arrays ordenados de nuevo a cadenas y comparamos
        return arrPalabra1.join("") === arrPalabra2.join("");
    }
}

// Solicitar al usuario que ingrese las palabras
const palabra1 = prompt("Dame la primera palabra:");
const palabra2 = prompt("Dame la segunda palabra:");

// Verificar si son anagramas
const resultado = sonAnagramas(palabra1, palabra2);
console.log(resultado);

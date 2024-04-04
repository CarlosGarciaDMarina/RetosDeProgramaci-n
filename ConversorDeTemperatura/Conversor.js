/*              Conversor de temperatura
 * Crea una función que transforme grados Celsius en Fahrenheit
 * y viceversa.
 *
 * - Para que un dato de entrada sea correcto debe poseer un símbolo "°"
 *   y su unidad ("C" o "F").
 * - En caso contrario retornará un error.
 */

let unidad = "23 º f"

// Esta funcion convierte de Fahrenheit a Celsius y viceversa
function conversorTemperatura(unidad) {
    // Dividimos el dato que nos han pasado por partes 
    let partes = unidad.split(" ");

    // La parte numérica la guardamos y convertimos en Float
    let parteNum = partes[0];
    parteNum = parseFloat(parteNum);

    // La parte del tipo de ud lo transformamos en string y lo transformamos a mayusculas
    let parteUd = partes.slice(1, 3).join(" ");
    parteUd = parteUd.toUpperCase();

    // Comprobamos si contiene la unidad correctamente escrita
    if (parteUd.includes("F") && parteUd.includes("º")){
        // Convertimos a Celcius
        console.log("La una unidad ha sido introducida en grados Fahrenheit asique la convertiremos a Celsius");
        
        // Hacemos la operacion
        var resultado = (parteNum - 32) / 1.8;

        // Devolvemos el resultado
        return resultado;

    } else if (parteUd.includes("C") && parteUd.includes("º")){
        // Convertimos a Fahrenheit
        console.log("La una unidad ha sido introducida en grados Celsius asique la convertiremos a Fahrenheit");

        // Hacemos la operacion
        var resultado = (parteNum * 1.8) + 32;

        // Devolvemos el resultado
        return resultado;

    } else {
        // Devolvemos mensaje de error
        return "La unidad que has introducido no es una unidad válida.";
    }
}

console.log(conversorTemperatura(unidad));
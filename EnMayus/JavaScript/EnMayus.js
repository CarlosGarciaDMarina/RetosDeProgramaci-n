/*
 * EnMayuscula
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan
 * directamente.
 */
function enMayuscula(frase) {
    // Dividir la frase en palabras
    let palabras = frase.split(' ');
  
    // Modificar la primera letra de cada palabra
    let palabrasModificadas = palabras.map(palabra => {
      return palabra.charAt(0).toUpperCase() + palabra.slice(1);
    });
  
    // Unir las palabras modificadas en una cadena
    let resultado = palabrasModificadas.join(' ');
  
    return resultado;
  }
  
  // Preguntar al usuario por una palabra o frase
  let entradaUsuario = prompt("Introduce una palabra o frase: ");
  
  // Aplicar la función
  let resultadoFinal = enMayuscula(entradaUsuario);
  
  // Mostrar el resultado
  console.log("Resultado:", resultadoFinal);
  
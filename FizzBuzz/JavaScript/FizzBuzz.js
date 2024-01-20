/*          FIZZBUZZ
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

//Funciones
//Funcion para saber si un numero es multiplo de 3
function fizz(num) {
    return num % 3 == 0;
}

//Funcion para saber si un numero es multiplo de 5
function buzz(num) {
    return num % 5 == 0;
}

//Funcion para saber si un numero es multiplo de 3 y de 5
function fizzBuzz(num) {
    return (num % 3 == 0) && (num % 5 == 0);
}

//Creamos un bucle que recorra los 100 numeros
for (let i = 1; i < 101; i++) {
    //Creamos las condiciones para que muestre o fizz o buzz
    if (fizzBuzz(i)) {
        document.write("FizzBuzz <br>");
    } else if(buzz(i)){
        document.write("Buzz <br>");  
    } else if(fizz(i)){
        document.write("Fizz <br>");  
    } else {
        document.write(i + "<br>");
    }  
}
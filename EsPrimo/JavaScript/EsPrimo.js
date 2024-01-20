/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
//Escribimos la funcion para determinar si un número es primo
function esPrimo(num) {
    return num % 2 == 1;
}

//Declaramos las variables
let i = 0;

//Le pedimos un numero al usuario 
let num = prompt("Dame un numero y te dire si es primo:");

//Establecemos las condiciones
if(esPrimo(num)){
    console.log("El numero " + num + " es un numero primo.");
} else {
    console.log("El numero " + num + " no es un numero primo.");
}

console.log("Vamos a mostrar todos los numeros entre 1 y 100: ");

//Creamos el bucle que imprimirá todos los primos entre 1 y 100
for (i = 0; i < 101; i++) { 
    //Establecemos las condiciones
    if (esPrimo(i)) {
        console.log(i);
    }
}
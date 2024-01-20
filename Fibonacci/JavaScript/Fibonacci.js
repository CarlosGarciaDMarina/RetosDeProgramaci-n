//Inicializamos las variables
let num = 50;
let primero = 0;
let segundo = 1;

//Avisamos al usuario de que vamos a imprimir los 50 primeros numeros de la secuencia Fibonacci
console.log("Los primeros " + num + " de la secuencia de Fibonacci son: ");

for (let index = 0; index < num; index++) {
    //Mostramos el primer numero
    console.log(primero + " ");
    
    //Calculamos el siguiente termino sumando los dos anteriores
    let siguiente = primero + segundo;

    //Ajustamos el bucle para las siguientes iteraciones
    primero = segundo;
    segundo = siguiente;
    
}
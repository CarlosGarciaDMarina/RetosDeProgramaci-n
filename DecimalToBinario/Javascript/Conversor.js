/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
//Funciones
//Creamos una funcion que convierta un numero decimal a binario
function conversor(decimal) {
    //si el usuario introduce el numero 0 devolvemos 0
    if (decimal === 0) {
        return '0';
    } else {
        //creamos la variable que va a almacenar el resultado
        let binario = '';
        //Bucle que, mientras el resultado del decimal sea mayo que 0 se repetira
        while (decimal > 0) {
            const resto = decimal % 2; //Almacenamos el resto de la operacion
            binario = reminder + binario; //Insertamos el resto al principio
            decimal = Math.floor(decimal / 2); //Dividimos el valor del decimal por 2, el Math.floor es para redondear hacia abajo
        }
        //Devolvemos el resultado al usuario
        return binario;
    }
}
//Preguntamos al usuario y lo almacenamos
const decimal = prompt("Este programa convierte un numero decimal a binario, dame un numero decimal: ");
//Almacenamos el resultado del conversor
const resultado = conversor(parseInt(decimal,10));
//Lo mostramos por pantalla
console.log("El resultado de la conversion es: ",resultado);

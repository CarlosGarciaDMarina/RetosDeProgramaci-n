/*
 * Crea un programa se encargue de transformar una cadena de texto a binario 
 * sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
//Creamos las variables que vamos a necesitar
var cadena = ["Hola mundo"];
let cadenaConvertida = "";
//Creamos el bucle que recorra la cadena
for (let i = 0; i < cadena.length; i++) {
    //Creamos el segundo bucle que recoja cada letra dentro de cada posicion de la cadena
    for (let j = 0; j < cadena[i].length; j++) {
        //Creamos los condicionales que van a determinar si es 1 o 0
                        //Creamos un condicional que cada vez que identifique una vocal en la palabra, la convierta en 1
        if ((cadena[i].charAt(j) == 'a') || (cadena[i].charAt(j) == 'e') || (cadena[i].charAt(j) == 'i') || 
            (cadena[i].charAt(j) == 'o') || (cadena[i].charAt(j) == 'u')) {
            cadenaConvertida += "1";     
        } else {
            //En caso contrario será un 0
            cadenaConvertida += "0";
        }
    }
    console.log(cadenaConvertida);
}
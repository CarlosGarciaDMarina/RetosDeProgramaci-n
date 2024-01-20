/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

//Creamos una funcion que de el area de un poligono
function areaPoligono(opcion, lado, base, altura) {
    //Declaramos la variable que almacenara el resultado
    let resultado = 0.0;

    //Establecemos las condiciones    
    if(opcion === 1){
        //Es un triangulo
        resultado = (base * altura) / 2;
        return resultado;

    } else if(opcion === 2){
        //Es un cuadrado
        resultado = lado * lado;
        return resultado;

    } else if(opcion === 3){
        //Es un rectángulo
        resultado = base * altura;
        return resultado;
    }
    
}

//Declaramos las variables que vamos a utilizar
let resultado = 0;
let respuesta = 0;
let base = 0.0;
let lado = 0.0;
let altura = 0.0;

do {
    console.log("|----------------|");
    console.log("|0. Salir.       |");
    console.log("|1. Triángulo.   |");
    console.log("|2. Cuadrado.    |");
    console.log("|3. Rectángulo.  |");
    console.log("|----------------|");

    respuesta = parseFloat(prompt("Selecciona una opcion del menú:"));

    switch (respuesta) {
        case 0:
            //Salir
            console.log("El programa se va a cerrar.");
            break;

        case 1:
            //Triangulo
            console.log("Has seleccionado el triángulo.");
            base = prompt("Introduce la base del triángulo: ");
            altura = prompt("Introduce la altura del triángulo: ");

            resultado = areaPoligono(1, lado, base, altura);
            console.log("El resultado del area del triángulo es " + resultado);
            break;

        case 2:
            //Cuadrado
            console.log("Has seleccionado el cuadrado.");
            lado = prompt("Introduce el lado: ");
    
            resultado = areaPoligono(2, lado, base, altura);
            console.log("El resultado del area del cuadrado es " + resultado);
            break;

        case 3:
            //Rectángulo
            console.log("Has seleccionado el rectángulo.");
            base = prompt("Introduce la base del rectángulo: ");
            altura = prompt("Introduce la altura del rectángulo: ");
        
            resultado = areaPoligono(3, lado, base, altura);
            console.log(`El resultado del area del rectángulo es ${resultado}`);
            break;
    
        default:
            console.log("Has elegido una opcion que no esta en el programa.")
            console.log("El programa se va a cerrar.")
            break;
    }
    
} while ((respuesta > 0) && (respuesta < 4));
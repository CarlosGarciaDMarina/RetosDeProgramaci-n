/*
 * Calculadora
 * crea una calculadora con interfaz utlizando las minimas lineas de codigo posibles
 * que sea modular
 * EXTRA: Gestion de errores
 */
//Funciones
//Funcion para sumar
function sumar(num1, num2) {
    return num1 + num2;
}
//Funcion para restar
function restar(num1, num2) {
    return num1 - num2;
}
//Funcion para multiplicar
function multiplicar(num1, num2) {
    return num1 * num2;
}
//Funcion para dividir
function dividir(num1, num2) {
    return num1 / num2;
}

//Try-catch para  gestionar errores
try {
    // Pedimos al usuario dos números
    let numero1 = parseFloat(prompt("Ingrese el primer número:"));
    let numero2 = parseFloat(prompt("Ingrese el segundo número:"));

    // Verificamos si los números son válidos con la funcion isNaN (is Not a Number, devuelve true si no es un numero o un valor transformable a numero)
    if (isNaN(numero1) || isNaN(numero2)) {
        throw new Error("Por favor, ingrese números válidos.");
    }

    // Pedimos la operación al usuario
    let operacion = prompt("Introduce la operación a realizar (+, -, *, /):");

    // Realizamos la operación y mostramos el resultado
    switch (operacion) {
        case '+':
            console.log(`Resultado: ${numero1 + numero2}`);
            break;
        case '-':
            console.log(`Resultado: ${numero1 - numero2}`);
            break;
        case '*':
            console.log(`Resultado: ${numero1 * numero2}`);
            break;
        case '/':
            // Verificamos si la división es por cero
            if (numero2 === 0) {
                throw new Error("No se puede dividir por cero.");
            }
            console.log(`Resultado: ${numero1 / numero2}`);
            break;
        default:
            throw new Error("Operación no válida. Has introducido un simbolo no valido.");
    }
} catch (error) {
    // Capturar y manejar cualquier error
    console.error(`Error: ${error.message}`);
} finally {
    // Código que se ejecutará siempre, independientemente de si hay un error o no
    console.log("Operación finalizada.");
}
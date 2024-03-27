// Solicitar al usuario que ingrese una frase
let frase = ("Por favor, ingresa una frase:");

// Contar el número de palabras en la frase
let palabras = frase.split(" ").filter(word => word.trim() !== "").length;

// Mostrar el resultado al usuario
console.log("La frase ingresada tiene " + palabras + " palabras.");

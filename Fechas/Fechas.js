/*
 * EJERCICIO:
 * Crea dos variables utilizando los objetos fecha (date, o semejante) de tu lenguaje:
 * - Una primera que represente la fecha (día, mes, año, hora, minuto, segundo) actual.
 * - Una segunda que represente tu fecha de nacimiento (te puedes inventar la hora).
 * Calcula cuántos años han transcurrido entre ambas fechas.
 *
 * DIFICULTAD EXTRA (opcional):
 * Utilizando la fecha de tu cumpleaños, formatéala y muestra su resultado de
 * 8 maneras diferentes. Por ejemplo:
 * - Día, mes y año.
 * - Hora, minuto y segundo.
 * - Día de año.
 * - Día de la semana.
 * - Nombre del mes.
 * - Nombre del día.
 * - Formato con Dia y mes con nombre.
 * - Formato con Dia y mes con nombre con horas.
 */

// Fecha actual
let fecha = new Date();
let dia = fecha.getDate();
let mes = fecha.getMonth() + 1;
let año = fecha.getFullYear();
let diaSem = fecha.getDay();

// Fecha cumpleaños
let cumpleaños = new Date();
cumpleaños.setDate(29);
cumpleaños.setMonth(5);
cumpleaños.setFullYear(1991);

// Diferencia
let añoActual = fecha.getFullYear();
let añoCumple = cumpleaños.getFullYear();
let resultado = añoActual - añoCumple;

// Dificultad extra
const inicioAño = new Date(fecha.getFullYear(), 0, 0);
const tiempoTranscurrido = fecha - inicioAño;
const diaDelAño = Math.floor(tiempoTranscurrido / (1000 * 60 * 60 * 24)) + 1;


// Imprimimos por pantalla
console.log(`---------------- Reto técnico ----------------`);
console.log("");
console.log(`Hoy es dia ${dia} del mes ${mes} del año ${año}`);
console.log("");
console.log(`Mi cumpleaños es ${cumpleaños}`);
console.log("");
console.log(`El año actual es ${añoActual} y el año en el que nací fué ${añoCumple} asi que tengo ${resultado} años.`);
console.log("");
console.log(`-------------- Dificultad extra --------------`);
console.log("");
console.log(`Formato Día/Mes/año: ${dia} / ${mes} / ${año}`);
console.log("");
console.log(`Formato Hora/Minuto/Segundo: ${fecha.getHours()} / ${fecha.getMinutes()} / ${fecha.getSeconds()}`);
console.log("");
console.log(`Formato día del año: ${diaDelAño}`);
console.log("");
console.log(`Formato día de la semana: ${fecha.getDay()}`);

// Para la dificultad extra del nombre del mes
if (mes === 1) {
    mes = "Enero";
} else if (mes === 2) {
    mes = "Febrero";
} else if (mes === 3) {
    mes = "Marzo";
} else if (mes === 4) {
    mes = "Abril";
} else if (mes === 5) {
    mes = "Mayo";
} else if (mes === 6) {
    mes = "Junio";
} else if (mes === 7) {
    mes = "Julio";
} else if (mes === 8) {
    mes = "Agosto";
} else if (mes === 9) {
    mes = "Septiembre";
} else if (mes === 10) {
    mes = "Octubre";
} else if (mes === 11) {
    mes = "Noviembre";
} else if (mes === 12) {
    mes = "Diciembre";
} else {
    mes = "Ese mes no existe";
}

console.log("");
console.log(`Formato nombre del mes: ${mes}`);

// Para la dificultad extra del día de la semana
if (diaSem === 1) {
    diaSem = "Lunes";
} else if (diaSem === 2) {
    diaSem = "Martes";
} else if (diaSem === 3) {
    diaSem = "Miércoles";
} else if (diaSem === 4) {
    diaSem = "Jueves";
} else if (diaSem === 5) {
    diaSem = "Viernes";
} else if (diaSem === 6) {
    diaSem = "Sábado";
} else if (diaSem === 7) {
    diaSem = "Domingo";
} else {
    diaSem = "Ese día no existe";
}

console.log("")
console.log(`Formato nombre del día: ${diaSem}`);
console.log("")
console.log(`Hoy es ${diaSem} dia ${dia} de ${mes} de ${año}`);
console.log("")
console.log(`Hoy es ${diaSem} dia ${dia} de ${mes} de ${año}, son las ${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
console.log("")


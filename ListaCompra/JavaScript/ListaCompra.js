//Variables
let listaCompra = [];
let introElem = "";

do {
    console.log("|-----------------------|");
    console.log("|1. Introducir elemento.|");
    console.log("|2. Borrar elemento.    |");
    console.log("|3. Mostrar listado.    |");
    console.log("|4. Salir del programa. |");
    console.log("|-----------------------|");

    let respuesta = prompt("Introduce una opcion del menu: ");

    switch (respuesta) {
        case "1":
            //Introducir
            console.log("Has seleccionado la opcion de introducir un elemento.");
            introElem = prompt("Introduce el elemento: ");
            //Agregamos el elemento
            listaCompra.push(introElem);
            console.log("El elemento " + introElem + " ha sido añadido con éxito.");
            break;
        case "2":
            //Eliminar
            console.log("Has seleccionado la opcion de eliminar un elemento.");
            //Mostramos la lista
            console.log(listaCompra);
            //Pedimos el elemento a borrar
            introElem = prompt("Introduce el elemento: ");
            // Encontrar el índice del elemento que deseas eliminar
            let indiceEliminar = listaCompra.indexOf(introElem);

            // Verificar si el elemento existe antes de intentar eliminarlo
            if (indiceEliminar !== -1) {
                // Eliminar el elemento en el índice encontrado
                listaCompra.splice(indiceEliminar, 1);
                console.log("El elemento " + introElem + " ha sido eliminado con éxito.");
            } else {
                console.log("El elemento " + introElem + " no fue encontrado en la lista.");
            }
            break;
        case "3":
            //Mostramos la lista
            console.log(listaCompra);
            break;
        case "4":
            //Salir
            console.log("El programa ha finalizado.");
            break;
        default:
            console.log("Has introducido una opción fuera de rango, el programa ha finalizado.");
            break;
    }

} while (respuesta !== "4");


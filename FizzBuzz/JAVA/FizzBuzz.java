package FizzBuzz.JAVA;

/*          FIZZBUZZ
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

 public class FizzBuzz {

    //Esta funcion devuelve todos los multiplos de 3 
    public static boolean fizz(int numero){     
        return numero % 3 == 0;
    }
    //Esta funcion devuelve todos los multiplos de 5 
    public static boolean buzz(int numero){     
        return numero % 5 == 0;
    }

    //Esta funcion devuelve todos los multiplos de 3 y 5 a la vez
    public static boolean fizzBuzz(int numero){     
        if ((numero % 3 == 0) && (numero % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        //Bucle que recorre todos los numeros entre 1 y 100
        for(int i = 1; i < 101; i++){    

            //Condicionales para establecer que numeros son Fizz, Buzz y FizzBuzz
            if(fizzBuzz(i)) {
                System.out.println("FizzBuzz\n");
            } else if (buzz(i)) {
                System.out.println("Buzz\n");
            } else if(fizz(i)){
                System.out.println("Fizz\n");
            } else {
                System.out.println(i);
            }
        }

    }
}

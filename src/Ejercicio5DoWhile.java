public class Ejercicio5DoWhile {

    public static void main(String[] args) {

        /* Guardo un valor inicial inválido
        para simular el primer intento */
        double montoApertura = -1000;

        /* Ahora uso el (do while) porque necesito que el bloque
         * se ejecute por lo menos una vez antes de revisar la
         * condicion.
         *
         * do = primero ejecuta lo que está dentro.
         * while (...) = después revisa si debe repetir.
         * montoApertura <= 0 significa: mientras el monto sea menor
         * o igual a cero, debe volver a intentarlo*/

        do {

            /* Muestro el primer valor para simular un intento inválido */
            System.out.println("Monto ingresado: " + montoApertura);

            /* Cambio el monto a un valor válido para que el ciclo pueda terminar */
            montoApertura = 50000;


        } while (montoApertura <= 0);

        /* Logica del do-while
         * primero montoApertura vale -1000 = inválido;
         * entra al do;
         * dentro cambias el valor a 50000;
         * revisa 50000 <= 0 = false;
         * termina el ciclo;
         * muestra el monto válido.*/

        /* Muestro el monto válido con el que se abre la caja */
        System.out.println("Monto de apertura válido: " + montoApertura);

    }

    /* Pregunta:
    ¿Por qué do-while es más apropiado que while aquí?
    Describe con tus palabras la diferencia en el orden de
    ejecución.

    Uso do-while porque primero ejecuta el bloque y despues
    revisa la condicino.

    Y se requiere lo anterior porque necesito que el intento
    se haga por lo menos una vez y en cambio solo while revisa
    primero la condicion y luego decide si ejecuta el bloque*/
}
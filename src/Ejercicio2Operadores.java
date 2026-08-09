public class Ejercicio2Operadores {

    public static void main(String[] args) {

        /* Guardo el subtotal del pedido*/
        double subtotal = 42500;

        /* Guardo el porcentaje de descuento que aplica la cafetería*/
        double porcentajeDescuento = 0.15;

        /* Reviso si el subtotal es mayor a 30000
        * (>) = Mayor que (42500 > 30000)*/
        boolean aplicaDescuento = subtotal > 30000;

        /* Calculo cuánto dinero se descuenta del subtotal */
        double valorDescuento = subtotal * porcentajeDescuento;

        /* Calculo el total que debe pagar el cliente después del descuento */
        double totalPagar = subtotal - valorDescuento;

        /* Muestro el valor del descuento con dos decimales */
        System.out.printf("Valor del descuento: %.2f%n", valorDescuento);

        /* Muestro el total que debe pagar el cliente */
        System.out.printf("Total a pagar: %.2f%n", totalPagar);

        /* Muestro si el cliente tiene derecho al descuento */
        System.out.printf("¿Aplica descuento?: %b%n", aplicaDescuento);

        /* ¿Qué operador usaste para determinar si aplica el descuento?
        ¿Qué tipo de dato devuelve ese operador?

        Para saber si aplica el descuento use el operador maro que (>)
        que compara si el subtotal es mayor a 30000

        Entonces el resultado de la comparacion es un valor booleano
        es decir, devuelve true si se cumple la condicion o felse si
        no se cumple*/


    }
}

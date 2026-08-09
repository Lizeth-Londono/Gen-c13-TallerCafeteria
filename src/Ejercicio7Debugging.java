public class Ejercicio7Debugging {

    public static void main(String[] args) {

        /* Error 1: Quiero guardar un número entero en cantidadVendida,
        * pero "5" está entre comillas dobles, así que Java lo interpreta como texto*/
        //int cantidadVendida = "5";

        /* Corrección*/
        int cantidadVendida = 5;

        double precioUnitario = 4500;

        /* Error 2: double total = cantidadVendida * precioUnitario,
        no tiene ; al final. */
        //double total = cantidadVendida * precioUnitario

        /* Corrección*/
        double total = cantidadVendida * precioUnitario;

        boolean aplicaDescuento = (total > 20000);

        /* Error 3: if (aplicaDescuento = true) hay una diferencia
        muy importante:
        =    asignar un valor
        ==   comparar valores
        Entonces con (= true) estoy cambiando el valor de la variable a true,
        no preguntando si ya era true*/
        //if (aplicaDescuento = true) {}

        /* Corrección*/
        if (aplicaDescuento == true) {

            total = total - (total * 0.10);

        }

        System.out.println("Total: " + total);

    }

    /* Pregunta:
    ¿Cuántos errores encontraste?
    R= Encontré 3 errores.

    Clasifica cada uno: ¿es un error de compilación o un error lógico?
    1. int cantidadVendida = "5"; error de compilación porque estaba intentando guardar
    un texto dentro de una variable int.

    2. Faltaba el punto y coma al final de la operación de total entonces
    tambien era un error de compilación porque Java no podía interpretar
    correctamente el final de la instruccion.

    3. En el if se estaba usando = en lugar de ==, error lógico porque = asigna un valor
    mientras que == compara valores.

    ¿Cómo los distingues?
    Distingi un error de compilacion porque el programa no puede ejecutarce
    hasta corregirlo y en cambio un error de logica puede permitir que el programa
    ejecute pero el resultado o el comportamiento no es el esperado*/
}

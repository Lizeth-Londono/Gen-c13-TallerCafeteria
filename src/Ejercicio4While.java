public class Ejercicio4While {

    public static void main(String[] args) {

        /* Guardo la cantidad inicial de café molido disponible */
        int inventario = 50;

        /* Guardo cuántas unidades de café consume cada pedido */
        int consumoPorPedido = 2;

        /* Con (while) Mientras esta condición sea verdadera, repite lo que está dentro de las llaves
        Entonces repito los pedidos mientras el inventario sea de 10 unidades o más */
        while (inventario >= 10) {

            /* Resto del inventario las unidades que consume cada pedido */
            inventario = inventario - consumoPorPedido;

            /* Muestro cuántas unidades quedan después de cada pedido */
            System.out.println("Inventario restante: " + inventario);

        }

        /* Pregunta: ¿Qué ocurre si la condición del while nunca se vuelve falsa?
        ¿Cómo lo prevendrías en este caso?

        R= Si la condicion del while nunca se vuelve falsa el ciclo
        seguiria repitiendose infinitamente osea sin terminar y cabum el pc.

        Entonces para evitar esto debo asegurarme que alguna variable cambie
        dentro del ciclo y haga que la condicion deje de cumplirse.

        Y en este ejercicio como lo hice pues reste unidades al inventario en
        cada pedido y por eso finalmente el inventario baja de 10 y el while termina*/

    }
}

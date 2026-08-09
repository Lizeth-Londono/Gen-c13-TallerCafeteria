public class Ejercicio3Switch {

    public static void main(String[] args) {

        /* Guardo una letra para representar la categoría del producto*/
        char categoria = 'B';

        /* Reviso el código de la categoría para saber qué información mostrar*/
        switch (categoria) {

            /* Significa: Si categorias vale 'B,F,C,P', haz lo que viene debajo*/
            case 'B':

                /* Muestra en consola el nombre completo de las categorías*/
                System.out.println("Categoría: Bebida caliente");

                /* Muestra el IVA que corresponde a las bebidas calientes.*/
                System.out.println("IVA: 0%");

                /* Significa:Terminé este caso. Sal del switch*/
                break;


            case 'F':
                System.out.println("Categoría: Bebida fría");
                System.out.println("IVA: 5%");
                break;

            case 'C':
                System.out.println("Categoría: Comida");
                System.out.println("IVA: 8%");
                break;

            case 'P':
                System.out.println("Categoría: Postre");
                System.out.println("IVA: 8%");
                break;

            /* default significa: Si no coincide con ninguno de los casos anteriores, haz esto */
            default:

                /* Entra aqui y muestra que el código no existe*/
                System.out.println("Código de categoría no reconocido");

        }
    }
}

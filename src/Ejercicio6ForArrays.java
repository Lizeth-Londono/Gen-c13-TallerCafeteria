public class Ejercicio6ForArrays {

    public static void main(String[] args) {

        /* Guardo los nombres de los productos
        del menú en un arreglo de texto

        String = los valores que voy a guardar
        son textos.
        [] = indica que no voy a guardar un solo texto
        sino varios valores dentro de un arreglo.
        productos = es el nombre que le doy al arreglo.
        */
        String[] productos = {
                "Café americano",
                "Capuchino",
                "Jugo de naranja",
                "Tostada",
                "Brownie"


        };

        /* Guardo los precios de cada producto en otro arreglo
        *
        * Entonces double[] significa que voy a guardar varios
        * números que pueden tener decimales.
        * */
        double[] precios = {
                3500,
                5000,
                4000,
                4500,
                6000

        };

        /* Creo una variable para ir sumando todos los precios */
        double sumaPrecios = 0;



        /* Recorro todos los productos del menú usando un for
        *
        * int i = 0 = empiezo en la posición 0
        * i < productos.length = sigo mientras i sea menor que
        * la cantidad de productos.
        * i++ = en cada vuelta aumento i en 1
        * productos.length → me dice cuántos elementos tiene el arreglo.
        * */
        for (int i = 0; i < productos.length; i++) {

            /* Muestro el número del producto, su nombre y su precio
            *
            * productos[i] trae el producto que está en la posición actual.
            * precios[i] trae el precio de esa misma posición.
            * i + 1 solo para mostrar el menú empezando en 1,
            * aunque por dentro el arreglo empiece en 0
            * */
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);

            /* Voy acumulando el precio de cada producto */
            sumaPrecios = sumaPrecios + precios[i];

        }

        /* Calculo el promedio dividiendo la suma entre la cantidad de productos */
        double promedio = sumaPrecios / precios.length;

        /* Muestro el precio promedio del menú */
        System.out.println("Precio promedio del menú: $" + promedio);
    }

    /*Pregunta: ¿Por qué usas for aquí y no while?
    ¿Qué tiene el for que lo hace más conveniente cuando
    conoces el número de elementos?

    Uso (for) porque ya conozco la cantidad de elementos que tiene
    el arreglo entonces el me permite controlar en una sola linea
    desde donde empiezo hasta cuando repito y como aumento la posicion.

    Por eso me resulta mas factible que while, cuando se cuantas
    veces necesito recorrer algo*/

}

public class Ejercicio1Variables {

    public static void main(String[] args) {

        /* Declaro las variables que se requieren
        * para representar un producto de la
        * cafeteria*/

        /* Guardo el nombre del producto como texto*/
        String nombreProducto = "Capuchino";

        /* Guardo el precio del producto en un tipo duable
        * porque puede tener decimales*/
        double precioUnitario = 5000.0;

        /* Guardo la cantidad de producto disponible como
        * un numero entero*/
        int cantidadInventario = 20;

        /* Guardo si el producto esta disponible hoy y si esta
        * disponible*/
        boolean disponibleHoy = true;

        /* Guardo una sola letra como codigo del producto*/
        char codigoProducto = 'C';

        /* Muestro en consola el nombre del producto usando
         * String.format*/
        System.out.println(String.format("Producto: %s", nombreProducto));

        /* Muestro el precio del producto con dos cifras decimales */
        System.out.println(String.format("Precio: %.2f", precioUnitario));

        /* Muestro la cantidad de productos que tengo disponibles en el inventario*/
        System.out.println(String.format("Cantidad en inventario: %d", cantidadInventario));

        /* Muestro si el producto está disponible hoy*/
        System.out.println(String.format("Disponible hoy: %b", disponibleHoy));

        /* Muestro la letra que uso como código del producto*/
        System.out.println(String.format("Código del producto: %c", codigoProducto));



        /* Nota importantes:

        1. Nombre del producto
        String = voy a guardar texto.
        nombreProducto = es el nombre que yo le doy a la variable.
        = = le asigno un valor.
        "Capuchino" = es el texto que guardo.
        ; = indica que terminé esa instrucción.

        * "Capuchino"   // String: comillas dobles

        2. Precio del producto
        double = voy a guardar un número que puede tener decimales.
        precioUnitario = variable donde guardo el precio.
        5000.0 = valor del precio.

        3. Cantidad disponible
        int = número entero.
        cantidadInventario = cantidad de unidades disponibles.
        20 = tenemos 20 unidades.

        4. Disponibilidad
        boolean solo puede tener dos valores:
        true o false

        5. Código del producto
        char sirve para guardar un solo carácter.
        'C'           // char: comillas simples
                 */

        /* ¿Por qué usas double para el precio y no int?
        ¿Qué pasaría si declaras el precio como int y le asignas 3.50?

        R=Uso double para el precio porque este tipo de dato me permite guardar
        numeros con decimales y si intentara declarar el precio con int y asignarle
        3.50 Java me marca un error porque int solo acepta numeros enteros.
        */

    }
}
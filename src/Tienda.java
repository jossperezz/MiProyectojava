
import java.util.Scanner; // Importamos la clase Scanner

public class Tienda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para que la entrada sea por consola.

        // Definimos la cantidad máxima de productos que puede almacenar el inventario
        final int productos = 100;

        // Declaramos arreglos para almacenar datos de los productos
        String[] nombres = new String[productos];
        int[] cantidades = new int[productos];
        double[] precios = new double[productos];

        // Inicializamos el contador
        int totalProductos = 0;

        // Creamos una variable para finalizar el ingreso de productos
        char cont;

        // Bucle para ingresar productos al inventario inicial
        do {
            System.out.println("Agregar productos del inventario inicial");

            // Pedimos el nombre del producto por consola
            System.out.println("Ingrese el nombre del producto:");
            nombres[totalProductos] = scanner.nextLine();

            // Pedimos la cantidad en inventario y para esto utilizamos la funcion Integer.parseInt para convertir de enteros a strings
            System.out.println("Ingrese la cantidad en inventario:");
            cantidades[totalProductos] = Integer.parseInt(scanner.nextLine());

            // Pedimos el precio por unidad y convertimos la entrada a double con el mismo procedimiento anterior
            System.out.println("Ingrese el precio por unidad:");
            precios[totalProductos] = Double.parseDouble(scanner.nextLine());

            // Cada producto se le suma al contador
            totalProductos++;

            // Se pregunta si desea o no, continuar agregando productos
            System.out.print("¿Desea agregar otro producto? Colocar 's' si deseas seguir y 'n' si no: ");
            cont = scanner.nextLine().toLowerCase().charAt(0); // Convertimos a minúscula y tomamos el primer carácter
        } while (cont == 's'); // Continuamos mientras el usuario escriba 's'

        int opcion;

        // Bucle del menú de opciones
        do {
            System.out.println("Menú:");
            System.out.println("1. Actualizar cantidad de un producto");
            System.out.println("2. Ver reporte de inventario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    // Opción para actualizar la cantidad de un producto
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String nombreActualizar = scanner.nextLine();
                    boolean encontrado = false;

                    // Recorremos los productos con el booleano para buscar el nombre
                    for (int i = 0; i < totalProductos; i++) {
                        if (nombres[i].equalsIgnoreCase(nombreActualizar)) { // Ignora mayúsculas/minúsculas
                            // Si lo encontramos, pedimos la nueva cantidad a sumar
                            System.out.print("Ingrese la nueva cantidad a sumar: ");
                            int cantidadNueva = Integer.parseInt(scanner.nextLine());
                            cantidades[i] += cantidadNueva; // Sumamos la nueva cantidad
                            System.out.println("Cantidad actualizada correctamente.");
                            encontrado = true;
                            break;
                        }
                    }

                    // Si no se encuentra el producto, mostrar el mensaje correspondiente
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 2:
                    // Opción para mostrar el reporte del inventario
                    double totalInventario = 0;
                    System.out.println("--- Reporte Final ---");

                    // Recorremos todos los productos y mostramos la información
                    for (int i = 0; i < totalProductos; i++) {
                        double totalProducto = cantidades[i] * precios[i]; // Calculamos el valor total por cada producto
                        System.out.println("Producto: " + nombres[i]);
                        System.out.println("Cantidad: " + cantidades[i]);
                        System.out.println("Precio por unidad: " + precios[i]);
                        System.out.println("Valor total del producto: " + totalProducto);
                        totalInventario += totalProducto; // Sumamos al total del inventario
                    }

                    // Mostramos el valor total del inventario
                    System.out.println("Valor total del inventario: " + totalInventario);
                    break;

                case 3:
                    // Opción para salir del programa
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    // Control de errores si se ingresa una opción que no es válida
                    throw new AssertionError();
            }

        } while (opcion != 3); // El menú se repetirá hasta que se seleccione la opción 3 (salir)

        scanner.close(); // Cerramos el objeto Scanner
    }
}

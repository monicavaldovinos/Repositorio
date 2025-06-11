import Model.Producto;
import Model.Inventario;
public class App {
    public static void main(String[] args) throws Exception {
        Inventario inventario = new Inventario(3);

        Producto p1 = new Producto("P1", "Lápiz", 10);
        Producto p2 = new Producto("P2", "Cuaderno", 5);
        Producto p3 = new Producto("P3", "Borrador", 2);
        Producto p4 = new Producto("P4", "Regla", 1);

        System.out.println("Agregar P1: " + inventario.agregarProducto(p1));
        System.out.println("Total de ítems: " + inventario.totalItems());
        System.out.println("Agregar P2: " + inventario.agregarProducto(p2));
        System.out.println("Total de ítems: " + inventario.totalItems());
        System.out.println("Agregar P3: " + inventario.agregarProducto(p3));
        System.out.println("Total de ítems: " + inventario.totalItems());
        System.out.println("Agregar P4: " + inventario.agregarProducto(p4));
        System.out.println("Total de ítems: " + inventario.totalItems());

        System.out.println("Buscar productos:");
        System.out.println("Buscar P2: " + (inventario.buscar("P2") != null));
        System.out.println("Buscar P9: " + (inventario.buscar("P9") != null));

        System.out.println("\nEliminar producto P2:");
        System.out.println("Eliminar P2: " + inventario.eliminarProducto("P2"));
        System.out.println("Total de ítems: " + inventario.totalItems());

        System.out.println("\nAgregando P4 nuevamente:");
        System.out.println("Agregar P4: " + inventario.agregarProducto(p4));
        System.out.println("Total de ítems: " + inventario.totalItems());
    }
}
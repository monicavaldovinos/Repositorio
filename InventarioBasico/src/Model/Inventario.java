package Model;
public class Inventario {
    private Producto[] stock;
    public Inventario(int tamaño) {
        stock = new Producto[tamaño];
    }
    public boolean agregarProducto(Producto p) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                stock[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null && stock[i].getCodigo().equals(codigo)) {
                stock[i] = null;
                return true;
            }
        }
        return false;
    }

    public Producto buscar(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null && stock[i].getCodigo().equals(codigo)) {
                return stock[i];
            }
        }
        return null;
    }

    public int totalItems() {
        int total = 0;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                total += stock[i].getCantidad();
            }
        }
        return total;
    }
}

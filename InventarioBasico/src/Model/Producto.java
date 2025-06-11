package Model;
public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    public Producto(String codigo, String nombre, int cantidad) {
        setCodigo(codigo);
        setNombre(nombre);
        setCantidad(cantidad);
    }
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
             System.out.println("El código no puede estar vacío.");
        } else {
            this.codigo = codigo;
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa.");
        }
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
}


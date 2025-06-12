public class EmpleadoTiempoCompleto extends Empleado{
    
private String beneficios;

public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, String beneficios) {
    super(id, nombre, salarioBase);
    this.beneficios = beneficios;
}

public double calcularSalario(){
    return getSalarioBase(); // Asumiendo un 20% más por ser tiempo completo
}

public String getBeneficios() {
    return beneficios;
}

}

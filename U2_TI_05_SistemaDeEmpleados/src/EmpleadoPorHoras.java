public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;

    public EmpleadoPorHoras(String id, String nombre, double salarioBase, int horasTrabajadas) {
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalario() {
        double salario = salarioBase * horasTrabajadas;
        return salario;
    }

}


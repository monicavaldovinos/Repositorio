public class App {
    public static void main(String[] args) throws Exception {
        EmpleadoTiempoCompleto empleadotc = new EmpleadoTiempoCompleto("1", "Karla", 3000, "Salud");
        empleadotc.setSalarioBase(3000);
        System.out.println("El id del empleado es: " + empleadotc.getId());
        System.out.println("El nombre del empleado es: " + empleadotc.getNombre());
        System.out.println("El salario de tiempo completo es: " + empleadotc.calcularSalario());
        System.out.println("Sus beneficios: " + empleadotc.getBeneficios());
        System.out.println("-----------------------------------");

        EmpleadoPorHoras empleadoh = new EmpleadoPorHoras("2", "Evelyn", 2000, 30);
        empleadoh.setSalarioBase(500); // Actualizando salario base
        System.out.println("El id del empleado es: " + empleadoh.getId());
        System.out.println("El nombre del empleado es: " + empleadoh.getNombre());
        System.out.println("El salario por horas es: " + empleadoh.calcularSalario());

        
    }
}

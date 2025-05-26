import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)throws Exception {
    
        String x1 = JOptionPane.showInputDialog("Ingresa el primer número:");
        String x2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
        String x3 = JOptionPane.showInputDialog("Ingresa el tercer número:");

        double numero1 = Double.parseDouble(x1);
        double numero2 = Double.parseDouble(x2);
        double numero3 = Double.parseDouble(x3);
 
        double promedio = (numero1 + numero2 + numero3) / 3;

        String mensaje = String.format("El promedio es: %.2f", promedio);
        JOptionPane.showMessageDialog(null, mensaje);
}
}

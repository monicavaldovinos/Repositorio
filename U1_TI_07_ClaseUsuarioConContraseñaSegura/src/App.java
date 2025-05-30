import javax.swing.JOptionPane;
import model.UsuarioSeguro;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa tu usuario: ");
        
        UsuarioSeguro usuario = new UsuarioSeguro();
        String nombreUsuario = JOptionPane.showInputDialog("Ingresa tu usuario");
        usuario.setnombreUsuario(nombreUsuario);
        
        if(usuario.getNombreUsuario() == null) {
            JOptionPane.showMessageDialog(null, "El usuario no se ha creado correctamente.");
            return;
        }
        String password = JOptionPane.showInputDialog("ingresa tu contraseña");
        usuario.setPassword(password);

        String intentPassword = JOptionPane.showInputDialog("Ingresa tu contraseña nuevamente:");
        usuario.autenticar(intentPassword);

    
        
    }
}

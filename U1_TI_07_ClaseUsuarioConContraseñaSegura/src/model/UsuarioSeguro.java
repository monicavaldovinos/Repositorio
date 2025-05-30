package model;
import javax.swing.JOptionPane;
public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setnombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario no puede ser nulo o vacío.");
            return;
        }else {
            this.nombreUsuario = nombreUsuario;
        }
    }
    boolean mayuscula = false;
    boolean minuscula = false;
    boolean digito = false;

    public void setPassword(String password) {
        if (password.length() >= 8) {
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))) {
                mayuscula = true;
            }
            if(Character.isLowerCase(password.charAt(i))) {
                minuscula = true;   
            }  
            
            if(Character.isDigit(password.charAt(i))) {
                digito = true;
            }
        
        if(mayuscula == true){
            if(minuscula == true){
                if(digito == true){
                    this.password = password;
                }
        }
    }}}
    if(mayuscula == false){
        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayúscula.");
        // Terminar el programa si no se cumple la condición
        System.exit(0);
    }
    if(minuscula == false){
        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra minúscula.");
        System.exit(0);
    }
    if(digito == false){
        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un dígito.");
        System.exit(0);
    }
}
    

    
    public boolean autenticar(String intentPassword) {
    if (intentPassword == null) {
        JOptionPane.showMessageDialog(null, "La contraseña ingresada no puede ser nula.");
        return false;
    }

    if (intentPassword.equals(password)) {
        JOptionPane.showMessageDialog(null, "Acceso concedido");
        return true;
    } else {
        JOptionPane.showMessageDialog(null, "La contraseña no coincide");
        JOptionPane.showMessageDialog(null, "Acceso denegado");
        return false;
    }
}

}


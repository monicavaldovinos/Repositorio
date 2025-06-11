package mx.edu.utez.u2_ti_03_formulario;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;

import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.*;
        import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label lblNombre = new Label("Nombre: ");
        TextField tfNombre = new TextField();
        Label lblEdad = new Label("Edad: ");
        TextField tfEdad = new TextField();
        Label lblOpciones = new Label("Opciones: ");
        ObservableList<String> opciones = FXCollections.observableArrayList( "estudiante", "profesor", "administrador");
        ComboBox<String> cmbOpciones = new ComboBox(opciones);
        Button btnCrear = new Button("Crear");
        Label lblResultado = new Label("Resultado: ");

        btnCrear.setOnAction(e -> {
            String nombre = tfNombre.getText();
            int edad = Integer.parseInt(tfEdad.getText());
            String seleccion =cmbOpciones.getSelectionModel().getSelectedItem();

            if(nombre.isEmpty() || edad < 0 || seleccion==null){
                System.out.println("todos los campos son obligatorios");
                lblResultado.setText("Todos los campos son obligatorios");
            }else{
                lblResultado.setText("Resultado: " + nombre + "\nEdad: " + edad + "\nOpciones: " + seleccion);
                lblResultado.setStyle("-fx-text-fill: green; -fx-font-weight: bold;");

            }

        });
        GridPane form = new GridPane();
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);


        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblEdad, 0, 1);
        form.add(tfEdad, 1, 1);
        form.add(lblOpciones, 0, 2);
        form.add(cmbOpciones,1, 2);
        form.add(btnCrear, 1, 3);
        form.add(lblResultado, 0, 3);

        Scene scene = new Scene(form);
        stage.setTitle("Formulario con java FX");

        stage.setTitle("Formulario con JavaFX");
        Image image = new Image(getClass().getResourceAsStream("/icons/150897750_10507049.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
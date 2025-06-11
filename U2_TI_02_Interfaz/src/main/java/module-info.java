module utez.edu.mx.u2_ti_02_interfaz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens utez.edu.mx.u2_ti_02_interfaz to javafx.fxml;
    exports utez.edu.mx.u2_ti_02_interfaz;
}
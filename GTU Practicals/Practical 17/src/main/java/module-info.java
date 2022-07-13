module com.example.practical17 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.practical17 to javafx.fxml;
    exports com.example.practical17;
}
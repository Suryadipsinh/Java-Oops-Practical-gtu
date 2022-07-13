module com.example.assignment_4_b {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.assignment_4_b to javafx.fxml;
    exports com.example.assignment_4_b;
}
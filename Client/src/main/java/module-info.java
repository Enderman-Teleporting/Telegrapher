module com.typer.telegrapher {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires kotlin.stdlib;
    opens com.typer.telegrapher to javafx.fxml;
    exports com.typer.telegrapher;
    exports Windows;
    opens Windows to javafx.fxml;
}
module com.typer.telegrapher {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.typer.telegrapher to javafx.fxml;
    exports com.typer.telegrapher;
    exports com.typer.telegrapher.Windows;
    opens com.typer.telegrapher.Windows to javafx.fxml;
}
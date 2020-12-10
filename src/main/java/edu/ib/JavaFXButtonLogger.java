package edu.ib;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class JavaFXButtonLogger extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/logger.fxml"));
        Scene scene = new Scene(root, 300, 400);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}

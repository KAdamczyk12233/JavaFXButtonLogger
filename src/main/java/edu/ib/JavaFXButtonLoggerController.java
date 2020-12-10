package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class JavaFXButtonLoggerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private TextArea taDisplay;

    @FXML
    void onButtonClick(ActionEvent event) {
        Button button = (Button) (event.getSource());
        String label = button.getText();
        System.out.println(label);
        String text = taDisplay.getText();
        text = text + "\n" + label;
        taDisplay.setText(text);
    }

    @FXML
    void initialize() {
        assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'logger.fxml'.";
        assert btn2 != null : "fx:id=\"btn2\" was not injected: check your FXML file 'logger.fxml'.";
        assert taDisplay != null : "fx:id=\"taDisplay\" was not injected: check your FXML file 'logger.fxml'.";

    }
}

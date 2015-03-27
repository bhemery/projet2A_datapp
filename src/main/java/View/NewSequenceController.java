package View;
import java.net.URL;
import java.util.ResourceBundle;

import Controller.GUIController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewSequenceController implements Initializable {

    private GUIController controller;

    public void setController(GUIController controller) {
        this.controller = controller;
    }

    @FXML
    private Button validationButton;
    @FXML
    private Button cancelButton;
    @FXML
    private TextField name;

    @FXML
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert validationButton != null : "fx:id=\"validationButton\" was not injected: check your FXML file 'newComputingSequence.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'newComputingSequence.fxml'.";
    }

    @FXML
    private void handleCancel(ActionEvent event) {
        closeWindows();
    }

    @FXML
    private void handleValidation(ActionEvent event) {
        controller.receiveMessage(name.getText(), this.toString());
        closeWindows();
    }


    private void closeWindows()  {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}

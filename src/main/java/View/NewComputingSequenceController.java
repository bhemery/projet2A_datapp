package View;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import Controller.GUIController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewComputingSequenceController implements Initializable {

    private GUIController controller;
    private Consumer<String[]> lambda;

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
    private void handleCancel() {
        closeWindows();
    }

    @FXML
    private void handleValidation() {
        controller.addComputingSequence(name.getText(), lambda);
        closeWindows();
    }

    private void closeWindows()  {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void setUpdateList(Consumer<String[]> lambda) {
        this.lambda = lambda;
    }
}

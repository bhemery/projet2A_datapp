package View;
import java.net.URL;
        import java.util.ResourceBundle;

import Controller.GUIController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ManageExperimentationController implements Initializable {

    private GUIController controller;

    public void setController(GUIController controller) {
        this.controller = controller;
    }

    @FXML
    private Button addCompSeq;

    @FXML
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert addCompSeq != null : "fx:id=\"addCompSeq\" was not injected: check your FXML file 'openExperimentation.fxml'.";
    }

    @FXML
    private void handleAddCompSeq(ActionEvent event) {
        controller.receiveMessage("Click on \"Add a computing sequence\"", this.toString());
    }

}

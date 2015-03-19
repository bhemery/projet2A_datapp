package View;
import java.net.URL;
        import java.util.ResourceBundle;

import Controller.GUIController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ManageExperimentationController implements Initializable {

    private GUIController controller;

    public void setController(GUIController controller) {
        this.controller = controller;
    }

    @FXML
    private Button addCompSeq;
    @FXML
    private Button SeqSettings;

    //iframe ici
    @FXML private Parent view;
    @FXML private BorderPane contentArea;
    @FXML private SettingsSequenceController page1Controller;

    @FXML
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert addCompSeq != null : "fx:id=\"addCompSeq\" was not injected: check your FXML file 'openExperimentation.fxml'.";
        assert SeqSettings != null : "fx:id=\"SeqSettings\" was not injected: check your FXML file 'openExperimentation.fxml'.";
    }

    @FXML
    private void handleAddCompSeq(ActionEvent event) {
        controller.receiveMessage("Click on \"Add a computing sequence\"", this.toString());
    }

    @FXML
    private void handleSeqSettings(ActionEvent event) {
        controller.receiveMessage("SequenceSettings", this.toString());
        //contentArea.setCenter(page1Controller.getView());
        //System.out.println("toto");
    }

}

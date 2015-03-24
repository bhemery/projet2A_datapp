package View;
import java.io.IOException;
import java.net.URL;
        import java.util.ResourceBundle;

import Controller.GUIController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
    @FXML private Pane contentArea;

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

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/settingsSequence.fxml"));
        fxmlLoader.setBuilderFactory( new JavaFXBuilderFactory() );
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        contentArea.getChildren().clear();
        contentArea.getChildren().add(root);
    }

}

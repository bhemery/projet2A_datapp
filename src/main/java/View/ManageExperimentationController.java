package View;
import java.io.IOException;
import java.net.URL;
        import java.util.ResourceBundle;

import Controller.GUIController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.*;

public class ManageExperimentationController implements Initializable {

    private GUIController controller;

    public void setController(GUIController controller) {
        this.controller = controller;
    }

    @FXML
    private Button addCompSeq;
    @FXML
    private Button SeqSettings;
    @FXML
    private ListView computingSequenceList;

    //iframe ici
    @FXML private Pane contentArea;

    @FXML
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert addCompSeq != null : "fx:id=\"addCompSeq\" was not injected: check your FXML file 'manageExperimentation.fxml'.";
        assert SeqSettings != null : "fx:id=\"SeqSettings\" was not injected: check your FXML file 'manageExperimentation.fxml'.";
    }

    @FXML
    private void handleAddCompSeq(ActionEvent event) {
        controller.receiveMessage("Click on \"Add a computing sequence\"", this.toString());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/newComputingSequence.fxml"));
        fxmlLoader.setBuilderFactory( new JavaFXBuilderFactory() );
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        NewComputingSequenceController expController = fxmlLoader.getController();
        expController.setController(controller);
        expController.setUpdateList(value -> {
            ObservableList names = FXCollections.observableArrayList(value);
            computingSequenceList.setItems(names);
        });

        Stage stage = new Stage();
        int width = 500;
        int height = 200;
        //Taille minimale
        stage.setMinWidth(width);
        stage.setMinHeight(height);
        stage.setScene( new Scene(root, width, height) );
        stage.setTitle("Create a computing sequence");

        // Fenetre modale
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());

        stage.show();

        //envoie de la lamba function
        //controller.addComputingSequence();

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
        //remove d'un item -> clear du pane
    }
}

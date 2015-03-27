package View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Controller.GUIController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
    @FXML
    private Button addCompSeq;
    @FXML
    private ListView computingSequenceList;
    @FXML
    private Pane contentArea;

    public void setController(GUIController controller) {
        this.controller = controller;
    }

    @FXML
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert addCompSeq != null : "fx:id=\"addCompSeq\" was not injected: check your FXML file 'manageExperimentation.fxml'.";

        computingSequenceList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                displayComputingSequenceSettings(newValue);
            }
        });

    }

    @FXML
    private void handleAddCompSeq(ActionEvent event) {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/newComputingSequence.fxml"));
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
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
        stage.setScene(new Scene(root, width, height));
        stage.setTitle("Create a computing sequence");

        // Fenetre modale
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }


    private void displayComputingSequenceSettings(String selectedComputingSequence) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/settingsSequence.fxml"));
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
        Parent root;
        try {
            root = fxmlLoader.load();

            SettingsSequenceController control = fxmlLoader.getController();
            control.setComputingSequenceName(selectedComputingSequence);

            contentArea.getChildren().clear();
            contentArea.getChildren().add(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleStartExperimentation() {
        controller.startExperimentation();
    }

    @FXML
    public void handleDeleteCompSeq() {
        try {
            String computingSequenceName = computingSequenceList.getSelectionModel().getSelectedItem().toString();
            System.out.println(computingSequenceName);
            controller.removeComputingSequence(computingSequenceName, value -> {
                ObservableList names = FXCollections.observableArrayList(value);
                computingSequenceList.setItems(names);
            });
        } catch (NullPointerException e) {
        }
        contentArea.getChildren().clear();
    }
}

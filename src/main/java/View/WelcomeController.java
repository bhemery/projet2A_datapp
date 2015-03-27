package View;


import Controller.GUIController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    @FXML
    private Button createExpButton;

    @FXML
    private Button loadResultsButton;

    @FXML
    private Button openExpButton;


    @FXML
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert createExpButton != null : "fx:id=\"createExpButton\" was not injected: check your FXML file 'welcome.fxml'.";
        assert loadResultsButton != null : "fx:id=\"loadResultsButton\" was not injected: check your FXML file 'welcome.fxml'.";
        assert openExpButton != null : "fx:id=\"openExpButton\" was not injected: check your FXML file 'welcome.fxml'.";


    }

    @FXML
    private void handleCreateExperimentation(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/manageExperimentation.fxml"));
        fxmlLoader.setBuilderFactory( new JavaFXBuilderFactory() );
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        //Taille minimale
        stage.setMinWidth(810);
        stage.setMinHeight(550);
        stage.setScene( new Scene(root, 810, 530) );
        stage.setTitle("Create a new experimentation");
        stage.show();

        ManageExperimentationController expController = fxmlLoader.getController();
        GUIController workingController = new GUIController();
        expController.setController(workingController);

    }

    @FXML
    private void handleOpenExperimentation(ActionEvent event) {

    }

    @FXML
    private void handleLoadResults(ActionEvent event) {

    }
}

package View;


import Controller.GUIController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {



    private GUIController controller;

    public void setController(GUIController controller) {
        this.controller = controller;
    }



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
        controller.receiveMessage("Click on \"Create An experimentation\"", this.toString());


    }

    @FXML
    private void handleOpenExperimentation(ActionEvent event) {
        controller.receiveMessage("Click on \"Open An experimentation\"", this.toString());
    }

    @FXML
    private void handleLoadResults(ActionEvent event) {
        controller.receiveMessage("Click on \"Load an experimentation result\"", this.toString());
    }


}

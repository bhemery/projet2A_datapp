package View;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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

        location = fxmlFileLocation ;
        this.resources = resources;

        System.out.println("WelcomeController: " + fxmlFileLocation);
        System.out.println("WelcomeController: " + resources);

    }



    @FXML
    private void handleCreateExperimentation(ActionEvent event) {
        System.out.println("Click on \"Create An experimentation\"");
        //ControlerScene.getInstance().gotoOpenExpPage();
    }

    @FXML
    private void handleOpenExperimentation(ActionEvent event) {
        // TODO
        System.out.println("Click on \"Open An experimentation\"");
    }

    @FXML
    private void handleLoadResults(ActionEvent event) {
        // TODO
        System.out.println("Click on \"Load an experimentation result\"");
    }


}

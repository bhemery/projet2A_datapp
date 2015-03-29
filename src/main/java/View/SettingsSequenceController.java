package View;


import javafx.fxml.Initializable;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SettingsSequenceController implements Initializable {

    // @TODO -> utiles? a supprimer peut être??
    private String computingSequenceName;
    public void setComputingSequenceName(String name) {
        computingSequenceName = name;
    }


    @FXML
    private TextField field_learningData;
    @FXML
    private Button addFile_learningData;
    @FXML
    private Button addDB_learningData;
    @FXML
    private Button addURL_learningData;

    @FXML
    private MenuButton algorithms_testingData;
    @FXML
    private Button addFile_testingData;
    @FXML
    private Button addDB_testingData;
    @FXML
    private Button addURL_testingData;

    @FXML
    private TextField numberIterations;
    @FXML
    private TextField numberFolds;


    @FXML
    private Label algorithms_add;
    @FXML
    private Button addNewAlgorithm;
    @FXML
    private Button configureAlgo;

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert field_learningData != null : "fx:id=\"field_learningData\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert addFile_learningData != null : "fx:id=\"addFile_learningData\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert addDB_learningData != null : "fx:id=\"addDB_learningData\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert addURL_learningData != null : "fx:id=\"addURL_learningData\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert algorithms_testingData != null : "fx:id=\"algorithms_testingData\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert addFile_testingData != null : "fx:id=\"addFile_testingData\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert addDB_testingData != null : "fx:id=\"addDB_testingData\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert addURL_testingData != null : "fx:id=\"addURL_testingData\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert numberIterations != null : "fx:id=\"numberIterations\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert numberFolds != null : "fx:id=\"numberFolds\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert algorithms_add != null : "fx:id=\"algorithms_add\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert addNewAlgorithm != null : "fx:id=\"addNewAlgorithm\" was not injected: check your FXML file 'settingsSequence.fxml'.";
        assert configureAlgo != null : "fx:id=\"configureAlgo\" was not injected: check your FXML file 'settingsSequence.fxml'.";
    }


    @FXML
    public void handleAddNewAlgorithm() {
        //@todo
    }

    @FXML
    public void handleConfigureAlgorithm() {
        //@todo
    }
}

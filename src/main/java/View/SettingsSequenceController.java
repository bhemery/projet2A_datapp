package View;


import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class SettingsSequenceController implements Initializable {

    private String computingSequenceName;

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {

    }


    public void setComputingSequenceName(String  name){
        computingSequenceName = name;
    }
}

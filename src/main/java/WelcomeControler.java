import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Created by gaveriaux on 21/02/2015.
 */
public class WelcomeControler {

    @FXML
    private void handleCreateExperimentation(ActionEvent event) {
        System.out.println("Click on \"Create An experimentation\"");
        ControlerScene.getInstance().gotoOpenExpPage();
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

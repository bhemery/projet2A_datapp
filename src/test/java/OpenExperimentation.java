/**
 * Created by gaveriaux on 20/02/2015.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpenExperimentation extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/openExperimentation.fxml"));
        Scene scene = new Scene(root, 850, 600);
        scene.getStylesheets().add("css/openExperimentation.css");
        stage.setTitle("Open an experimentation");
        stage.setScene(scene);
        stage.show();
    }

}

/**
 * Created by gaveriaux on 20/02/2015.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DuringExperimentation extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/duringExperimentation.fxml"));
        Scene scene = new Scene(root, 650, 450);
        scene.getStylesheets().add("css/duringExperimentation.css");
        stage.setTitle("Current experimentation");
        stage.setScene(scene);
        stage.show();
    }
}

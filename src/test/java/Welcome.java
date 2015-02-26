/**
 * Created by gaveriaux on 20/02/2015.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Welcome extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/welcome.fxml"));
        Scene scene = new Scene(root, 448, 284);
        scene.getStylesheets().add("css/welcome.css");
        stage.setTitle("Welcome in DatApp");
        stage.setScene(scene);
        stage.show();
    }
}

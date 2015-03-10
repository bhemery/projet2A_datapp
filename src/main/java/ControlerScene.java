import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import scala.App;

/**
 * Main Application. This class handles navigation and user session.
 */
public class ControlerScene extends Application {
    private Stage stage;
    private static ControlerScene instance;

    public ControlerScene() {
        instance = this;
    }

    public static ControlerScene getInstance() {
        return instance;
    }

    /**
     * @param args the command line arguments
     */
    public void launchControler(String[] args) {
        launch(args);
    }

    @Override public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            gotoWelcomePage();
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoWelcomePage() {
        try {
            replaceSceneContent("/fxml/welcome.fxml");
        } catch (Exception ex) {
            System.err.println("Fail to access welcome.fxml");
        }
    }

    public void gotoOpenExpPage() {
        try {
            replaceSceneContent("/fxml/openExperimentation.fxml");
        } catch (Exception ex) {
            System.err.println("Fail to access openExperimentation.fxml");
        }
    }

    public void gotoDuringExperimentation() {
        try {
            replaceSceneContent("/fxml/duringExperimentation.fxml");
        } catch (Exception ex) {
            System.err.println("Fail to access duringExperimentation.fxml");
        }
    }

    private Parent replaceSceneContent(String fxml) throws Exception {
        Parent page = (Parent) FXMLLoader.load(App.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Scene scene = stage.getScene();

        if (scene == null) {
            scene = new Scene(page);
            stage.setScene(scene);
        } else {
            stage.getScene().setRoot(page);
        }

        stage.setX(10);
        stage.setY(10);

        if(fxml.equals("/fxml/welcome.fxml")) {
            stage.setTitle("view.Welcome in DatApp");
            stage.setWidth(450);
            stage.setHeight(280);
            scene.getStylesheets().add(App.class.getResource("/css/welcome.css").toExternalForm());
        }
        if(fxml.equals("/fxml/openExperimentation.fxml")) {
            stage.setTitle("Create a new experimentation");
            stage.setWidth(850);
            stage.setHeight(650);
            scene.getStylesheets().add(App.class.getResource("/css/openExperimentation.css").toExternalForm());
        }

        if(fxml.equals("/fxml/duringExperimentation.fxml")) {
            stage.setTitle("Current experimentation");
            stage.setWidth(650);
            stage.setHeight(450);
            scene.getStylesheets().add(App.class.getResource("/css/duringExperimentation.css").toExternalForm());
        }

        return page;
    }
}
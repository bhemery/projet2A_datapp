import javafx.application.Application
import javafx.fxml.{JavaFXBuilderFactory, FXMLLoader}
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

import Controller.GUIController
import View.WelcomeController


/**
 * Main class, launch the program
 */
class Appli extends Application {

  override def start(primaryStage: Stage): Unit = {

    val workingController = new GUIController

    val fxmlLoader = new FXMLLoader
    fxmlLoader.setLocation(getClass.getResource("/fxml/welcome.fxml"))
    fxmlLoader.setBuilderFactory( new JavaFXBuilderFactory )
    val root : Parent = fxmlLoader.load[Parent]

    val scene = new Scene(root, 320, 200)
    scene.getStylesheets.add(getClass.getResource("/css/welcome.css").toExternalForm)
    primaryStage.setScene( scene )
    primaryStage.setTitle("Welcome to DatApp")
    primaryStage.show

    val welcomeController = fxmlLoader.getController[WelcomeController]
    welcomeController.setController(workingController)

  }

}


object Appli{
  def main(args: Array[String]) {
    Application.launch(classOf[Appli], args: _*)
  }
}
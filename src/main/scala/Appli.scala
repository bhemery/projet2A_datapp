import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

import Controller.GUIController


/**
 * Main class, launch the program
 */
class Appli extends Application {

  override def start(primaryStage: Stage): Unit = {
    val workingController = new GUIController

    val root : Parent = FXMLLoader.load(getClass.getResource("/fxml/welcome.fxml"))


    primaryStage.setScene( new Scene(root, 340, 280) )
    primaryStage.setTitle("Welcome to DatApp")
    primaryStage.show
  }

}


object Appli{
  def main(args: Array[String]) {
    Application.launch(classOf[Appli], args: _*)
  }
}
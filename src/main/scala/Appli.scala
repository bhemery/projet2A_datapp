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

    val fxmlLoader = new FXMLLoader
    fxmlLoader.setLocation(getClass.getResource("/fxml/welcome.fxml"))
    fxmlLoader.setBuilderFactory( new JavaFXBuilderFactory )
    val root : Parent = fxmlLoader.load[Parent]

    val width = 320
    val height = 230
    val borderheight = 30

    val scene = new Scene(root, width, height - borderheight)
    scene.getStylesheets.add(getClass.getResource("/css/welcome.css").toExternalForm)
    primaryStage.setScene( scene )
    primaryStage.setTitle("Welcome to DatApp")
    // Taille minimale - remarque : taille différente entre scene et primaryStage.. pourquoi?
    primaryStage.setMinWidth(width)
    primaryStage.setMinHeight(height)

    primaryStage.show
  }
}

object Appli{
  def main(args: Array[String]) {
    Application.launch(classOf[Appli], args: _*)
  }
}

package Controller

import javafx.fxml.{JavaFXBuilderFactory, FXMLLoader}
import javafx.scene.{Scene, Parent}
import javafx.stage.Stage

import View.{ManageExperimentationController, SettingsSequenceController, WelcomeController}


class GUIController (primaryStage: Stage){

  println("GUIController: Here I am!")


  def receiveMessage(message : String, expediteur : String) = {
    println(s"Message recu (de la part de $expediteur): $message ")
    //if (message == "SequenceSettings")
    //  createSequenceSettings(primaryStage)
  }

}

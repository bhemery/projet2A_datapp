package Controller

import java.util.function.Consumer
import javafx.application.Platform
import javafx.fxml.{JavaFXBuilderFactory, FXMLLoader}
import javafx.scene.{Scene, Parent}
import javafx.stage.Stage
import scala.language.implicitConversions

import View.{ManageExperimentationController, SettingsSequenceController, WelcomeController}

import scala.concurrent.Future


class GUIController (primaryStage: Stage){


  implicit def funToRunnable(fun : () => Unit) : Unit = new Runnable(){ def run() : Unit= fun() }

  def receiveMessage(message : String, expediteur : String) : Unit = {
    println(s"Message recu (de la part de $expediteur): $message ")
    //if (message == "SequenceSettings")
    //  createSequenceSettings(primaryStage)
  }

 // def addComputingSequence(nom : String, lambda: Consumer[String]) = Future {

    //ajout a l'experimentation
    //res = experimentation.liste de string
    //la lambda met a jour la liste avec la la liste for-each
    //http://docs.oracle.com/javafx/2/ui_controls/list-view.htm



    // Platform.runLater(()=>lambda.accept(res))
  //}

  // Convertisseur de list de string en objet pr la liste de la vue


}

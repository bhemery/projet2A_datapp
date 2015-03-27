package Controller

import java.util.function.Consumer
import javafx.application.Platform
import javafx.collections.{FXCollections, ObservableList}
import javafx.fxml.{JavaFXBuilderFactory, FXMLLoader}
import javafx.scene.{Scene, Parent}
import javafx.stage.Stage
import Model.Experimentation

import scala.language.implicitConversions
import scala.concurrent.ExecutionContext.Implicits.global

import View.{ManageExperimentationController, SettingsSequenceController, WelcomeController}

import scala.concurrent.Future


class GUIController() {

  private val experiment = new Experimentation()

  implicit def funToRunnable(fun: () => Unit): Runnable = new Runnable() {
    def run(): Unit = fun()
  }

  def receiveMessage(message: String, expediteur: String): Unit = {
    println(s"Message recu (de la part de $expediteur): $message ")
  }

  def startExperimentation(): Unit =
    experiment.startExperimentation()

  def addComputingSequence(nom: String, lambda: Consumer[Array[String]]): Unit = Future {
    experiment.addComputingSequence(nom)
    val experimentnames = experiment.getComputingSequencesNames()
    Platform.runLater(() => lambda.accept(experimentnames.toArray))
  }

  def removeComputingSequence(nom: String, lambda: Consumer[Array[String]]): Unit = Future {
    experiment.removeComputingSequence(nom)
    val experimentnames = experiment.getComputingSequencesNames()
    Platform.runLater(() => lambda.accept(experimentnames.toArray))
  }

  // Convertisseur de list de string en objet pr la liste de la vue


}

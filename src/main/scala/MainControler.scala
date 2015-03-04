/**
 * Created by gaveriaux on 25/02/2015.
 */

import javafx.application.Application
import javafx.stage.Stage

import view.Welcome

object MainControler extends Application{
  override def start(primaryStage: Stage): Unit = {
    new Welcome(primaryStage)
  }
}
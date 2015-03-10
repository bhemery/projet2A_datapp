package Controller


class GUIController {

  println("GUIController: Here I am!")

  def receiveMessage(message : String, expediteur : String) = {
    println(s"Message recu (de la part de $expediteur): $message ")
  }

}

package Model

class Experimentation {

  private var computingSequences: List[ComputingSequence] = Nil

  def startExperimentation(): Unit = {
    // TODO a modifier pour effectivement faire le traitement.
    println("Starting experiment")
    computingSequences.foreach { computingSequence =>
      println(s"  -${computingSequence.name}")
    }
    println("Experiment completed")
  }

  def getComputingSequencesNames(): List[String] =
    computingSequences.map(_.name)

  def removeComputingSequence(name: String): Unit =
    computingSequences = computingSequences.filterNot(_.name == name)

  def addComputingSequence(name: String): Unit =
    computingSequences = new ComputingSequence(name) :: computingSequences

  def loadExperimentation(fileName: String): Unit = {
    //TODO
    //"experimentation"
  }

  def saveExperimentation(fileName: String): Unit = {
    //TODO
  }

}

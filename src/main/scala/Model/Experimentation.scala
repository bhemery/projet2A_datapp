package Model

/**
 * Created by anas on 26/03/15.
 * Description:Class that contains the list of computing sequences and create it
 */
class Experimentation {

  var compSequenceList:List[computingSequence] = Nil //On peut utiliser un vecteur

  def startExperimentation(): Unit ={
      //TODO
  }

  def addComputingSequence(name : String): Unit ={
    val computingSequence = new computingSequence(name)
     compSequenceList = computingSequence :: compSequenceList
  }

  def loadExperimentation(fileName : String): Unit ={
    //TODO
    //"experimentation"
  }

  def saveExperimentation(fileName : String): Unit ={
    //TODO
  }

}

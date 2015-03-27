package Model

/**
 * Created by anas on 26/03/15.
 * Description:Algorithm for loding the available algorithms in the weka.jar and the homefolder
 *            where Weka downloads all the new packages
 */
class AlgorithmLoader {

  val algos:Map[String, String] = loadAlgorithms()

  private def loadAlgorithms() : Map[String, String] ={

    //Creating an array for storing the algorithms names

    //Opening the weka.jar and getting all the classes to add to the gui list.

    //Opening the folder where Weka stores the downloaded classifiers from the packageManager to add to the gui list.

    //Adding to the array

    //returning the array.

    //utiliser les maps [String,String]
    Map("algo1" -> "Algorithms 1", "algo2"-> "Algorithms 2")

  }

  def getAlgoName : List[String] = algos.keys.toList

}

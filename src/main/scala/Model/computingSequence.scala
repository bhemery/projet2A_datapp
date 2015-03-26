package Model

import weka.classifiers.AbstractClassifier
import weka.core.converters.ConverterUtils.DataSource
//import weka.classifiers.

/**
 * Created by anas on 26/03/15.
 * Description:Class that holds a computing sequence
 */
class computingSequence {
  trait ValidationType
  case class CrossValidation(fold : Int) extends ValidationType
  case class SplitFile(pourcentage : Float) extends ValidationType
  class computingSequence(var name: String) {

        var sourceTrain: Option[DataSource] = None //source of the computing sequence
        var sourceTest: Option[DataSource] = None
        var validationType : ValidationType = CrossValidation(10)
        var numIteration:Int = 1
        var algorithm:List[AbstractClassifier] = Nil


    }
}

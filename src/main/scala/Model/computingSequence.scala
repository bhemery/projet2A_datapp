package Model

import weka.classifiers.AbstractClassifier
import weka.core.converters.ConverterUtils.DataSource
//import weka.classifiers.

trait ValidationType
case class CrossValidation(numberOfFold : Int) extends ValidationType
case class SplitFile(percentage : Float) extends ValidationType

class ComputingSequence(var name : String) {

  var sourceTrain : Option[DataSource] = None //source of the computing sequence
  var sourceTest : Option[DataSource] = None
  var validationType : ValidationType = CrossValidation(10)
  var numIteration : Int = 1
  var algorithm : List[AbstractClassifier] = Nil

  override  def toString() : String = s"Experimentation $name"

}

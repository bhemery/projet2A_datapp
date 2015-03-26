package classifiers

import weka.classifiers.bayes.NaiveBayes
import weka.classifiers.trees.J48
import weka.core.converters.ConverterUtils.DataSource
/**
 * Created by anas on 23/03/15.
 * Creating and executing a classifier
 */

object classifier {
  def main(args: Array[String]): Unit = {

      //Loading the dataset
      val source=new DataSource("/home/anas/Documents/iristest.arff")
      val dataset=source.getDataSet
      //Set class index  to the last attribute: Mandatory
      dataset.setClassIndex(dataset.numAttributes()-1)
      println("-------------NaiveBays----------------------------------")
      //Creating and buidling a classifier(NaiveBayes)
      val nb=new NaiveBayes
      //The buildClassifier method builds the classifier
      nb.buildClassifier(dataset)
      //Print out capabilities of the classifier
      println(nb.getCapabilities.toString)
      println("-------------NaiveBays----------------------------------")
      //Building another classifier(J48),Classifiers can use some options:see Weka documentation

      println("-------------J48-----------------------------------------")
      val options=Array("-C","0.11","-M","3")
      val tree=new J48
      tree.setOptions(options)
      tree.buildClassifier(dataset)
      println(tree.getCapabilities.toString)
      println(tree.graph())
      println("-------------J48-----------------------------------------")
    }

}

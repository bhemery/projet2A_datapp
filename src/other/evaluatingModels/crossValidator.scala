package evaluatingModels

import java.util.Random

import weka.classifiers.Evaluation
import weka.classifiers.trees.J48
import weka.core.converters.ConverterUtils.DataSource

/**
 * Created by anas on 24/03/15.
 * Using cross Validation
 */
object crossValidator {

      def main(args: Array[String]): Unit = {
        //Load datasets :Training Data
        val trainSource = new DataSource("/home/anas/Documents/studies/Projet_2A/weka-3-7-12/data/iris.arff")
        val trainDataset = trainSource.getDataSet

        //Setting the class index to the last attribute
        trainDataset.setClassIndex(trainDataset.numAttributes() - 1)

        //Creating and building the classifier
        val tree = new J48
        //Making the model
        tree.buildClassifier(trainDataset)

        //Making the evaluation trough the Evaluation class by passing the training set to the model

        val eval = new Evaluation(trainDataset)
        //Necessary for the cross validation method

        val rand = new Random(1)

        //Setting the number of folds
        val folds = 10
        //test dataset for evaluation

        val testSource = new DataSource("/home/anas/Documents/studies/Projet_2A/weka-3-7-12/data/iris_copy.arff")
        val testDataset = testSource.getDataSet

        //Setting the class index
        testDataset.setClassIndex(testDataset.numAttributes() - 1)

        //Evaluating using cross validation
        eval.crossValidateModel(tree, testDataset, folds, rand)

        //Printing some evaluation metrics
        println("Correct % =" + eval.pctCorrect())
        println("Incorrect % =" + eval.pctIncorrect())
        //confusion matrix
        println(eval.toMatrixString("===Confusion Matrix==="))

      }

}

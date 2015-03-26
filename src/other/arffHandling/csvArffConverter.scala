package arffHandling

import java.io.File

import weka.core.Instances
import weka.core.converters.{ArffSaver, CSVLoader}

/**
 * Created by anas on 26/03/15.
 */
object csvArffConverter {
  def main(args: Array[String]): Unit = {
    /** Saving from csv to arff **/

    //Creating a CSV Loader
    val csvloader = new CSVLoader

    //Setting the source of the loader
    csvloader.setSource(new File("/home/anas/Documents/studies/Projet_2A/weka-3-7-12/data/iris.csv"))

    //Loading the instances of the file:Getting an Instances object
    val csvdata: Instances = csvloader.getDataSet
    //Saving the file to ARFF
    val arffsaver = new ArffSaver
    //setting the dataset we want to convert
    arffsaver.setInstances(csvdata)
    //saving as ARFF
    arffsaver.setFile(new File("/home/anas/Documents/iristest.arff"))
    arffsaver.writeBatch

  }

}

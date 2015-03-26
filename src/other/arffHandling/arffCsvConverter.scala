package arffHandling

import java.io.File

import _root_.weka.core.converters.ArffLoader
import _root_.weka.core.converters.CSVSaver

/**
 * Created by anas on 23/03/15.
 * Opening an arff file in weka and getting the instances of the file
 * Saving from csv to Arff and vice versa
 */
object arffCsvConverter {

  def main(args:Array[String]): Unit ={

    /**Saving from arff to csv **/

    //Creating an ARFF Loader
    val arffloader=new ArffLoader()

    //Setting the source of the loader

    arffloader.setSource(new File("/home/anas/Documents/studies/Projet_2A/weka-3-7-12/data/iris.2D.arff"))

    //Loading the instances of the file:Getting an Instances object

    val data=arffloader.getDataSet //instances

    //Saving a file to CSV

    val saver=new CSVSaver()

    //Setting the data we want to convert
    saver.setInstances(data)

    //Saving the file as a CSV File

    saver.setFile(new File("/home/anas/Documents/studies/Projet_2A/weka-3-7-12/data/iris.csv"))
    saver.writeBatch()

  }

}

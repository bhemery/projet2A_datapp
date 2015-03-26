package classifiers

import weka.classifiers.meta.FilteredClassifier
import weka.classifiers.trees.J48
import weka.core.converters.ConverterUtils.DataSource
import weka.filters.unsupervised.attribute.Remove

/**
 * Created by anas on 23/03/15.
 * Using a filter on a classifier
 */
object filteredClassifier {

      def main(args: Array[String]): Unit = {
        //Loading dataset
        val source = new DataSource("/home/anas/Documents/iristest.arff")
        //Loading the instances
        val dataset = source.getDataSet
        //set class index to the last attribute
        dataset.setClassIndex(dataset.numAttributes() - 1)
        //Instanciating the classifier
        val tree = new J48
        //Instanciating the fitler
        val remove = new Remove
        //Setting classifier options
        val opts = Array("-R", "1")
        //Setting the filter options
        remove.setOptions(opts)
        //Creating the filteredClassifier object
        val fc = new FilteredClassifier
        //Specifying the filter
        fc.setFilter(remove)
        //Specifying the base classifier
        fc.setClassifier(tree)
        //Build the classifier
        fc.buildClassifier(dataset)
      }

}

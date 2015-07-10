import org.apache.flink.api.scala._
import org.apache.flink.api.scala.table._
import org.apache.flink.api.scala.ExecutionEnvironment

object Execute {

  def main(args: Array[String]) {

    if(!parseParameters(args)) {
      return
    }

    val env = ExecutionEnvironment.getExecutionEnvironment
    
    // for local testing (1 output file)
    env.setParallelism(1)

    // read in and preprocess data from the TCGA project
    
    
    // analyze the data using machine learning
    // Matrix Completion
    
    
    // analyze the data using network-based method
    // Network Analysis
    
    
    // build a classifier that can distinguish two cohorts 
    // e.g. cancer vs healthy or cancer sub-group A vs cancer sub-group B



    env.execute("Data Analysis Pipeline")
  }

  // global variables
  private var inputFile: String = null
  private var outputFolder: String = null

  // method for parsing the parameters
  private def parseParameters(args: Array[String]): Boolean = {
    if (args.length == 2) {
      inputFile = args(0)
      outputFolder = args(1)
      true
    }

    else {
      System.err.println("2 parameters are necessary:\n     <input file>\n     <output path>")
      false
    }
  }
}
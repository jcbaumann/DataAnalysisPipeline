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
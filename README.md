# DataAnalysisPipeline
Pipeline for the analysis of <a href="https://tcga-data.nci.nih.gov/tcga/tcgaCancerDetails.jsp?diseaseType=LUAD&diseaseName=Lung%20adenocarcinoma" target="_blank">lung adenocarcinoma data</a> from <a href="http://cancergenome.nih.gov" target="_blank">The Cancer Genome Atlas  (TCGA)</a> using <a href="http://www.scala-lang.org" target="_blank">Scala</a> and <a href="https://flink.apache.org" target="_blank"> Apache Flink</a>.

### Development Environment:
* <a href="https://www.jetbrains.com/idea/" target="_blank">IntelliJ IDEA 14 CE</a>

### Requirements:
* <a href="http://www.scala-lang.org" target="_blank">Scala SDK 2.10.4</a>
* <a href="https://flink.apache.org" target="_blank">Apache Flink 0.10-SNAPSHOT</a>

### Data:
* The analysis using the <a href="https://tcga-data.nci.nih.gov/tcga/tcgaCancerDetails.jsp?diseaseType=LUAD&diseaseName=Lung%20adenocarcinoma" target="_blank">lung adenocarcinoma data</a> available on <a href="http://cancergenome.nih.gov" target="_blank">TCGA</a> website.
* The data for the analysis were downloaded on 12th August 2015 9:19am.
* The following data were downloaded:
  * Clinical (Biotab)
  * Exp-Gene
  * miRNASeq

### Parameters:
* input file
* output path

pipeline{
  agent any
  /*environment{
    def workspaceName = sh(script: "basename ${env.WORKSPACE}", returnStdout:true).trim()
  }*/
  stages{
    stage('Test'){
      steps{
        script{
            def pipeline = load 'pipeline.groovy'
            pipeline.test()
        }
      }
    }
  }
}
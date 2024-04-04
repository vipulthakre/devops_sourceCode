 pipeline{
  agent any
  /*environment{
    def workspaceName = sh(script: "basename ${env.WORKSPACE}", returnStdout:true).trim()
  }*/
  stages{
    stage('Test'){
      steps{
        script{
          def ab = load 'pipeline.groovy'
          ab.test()
        }
      }
    }
  }
}

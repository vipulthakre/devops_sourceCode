// Jenkinsfile

// Load the functions from MyFunctions.groovy
def myFunctions = load 'MyFunctions.groovy'

pipeline {
    agent any
    
    stages {
        stage('Example') {
            steps {
                script {
                    // Call the function from MyFunctions.groovy
                    myFunctions.sayHello()
                }
            }
        }
    }
}


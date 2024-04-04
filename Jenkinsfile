pipeline {
    agent any
    
    stages {
        stage('Example') {
            steps {
                node {
                    // Load the functions from MyFunctions.groovy
                    def myFunctions = load 'MyFunctions.groovy'
                    
                    // Call the function from MyFunctions.groovy
                    myFunctions.sayHello()
                }
            }
        }
    }
}



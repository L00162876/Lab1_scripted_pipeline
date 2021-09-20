pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sudo sh "mvn --version"
                sudo sh "mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
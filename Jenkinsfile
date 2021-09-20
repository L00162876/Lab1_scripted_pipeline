pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sh ./run "mvn --version"
                sh ./run "mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
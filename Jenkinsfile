pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sh sudo "mvn --version"
                sh sudo "mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
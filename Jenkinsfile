pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                su -s /bin/bash jenkins
                sh "mvn --version"
                sh "mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
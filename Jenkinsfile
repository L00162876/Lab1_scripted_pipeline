pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sh "chmod +x ./.jenkins/workspace/Lab1_scripted_pipeline"
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
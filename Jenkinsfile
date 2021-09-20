pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sh "sudo su -s mvn --version"
                sh "sudo su -s mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
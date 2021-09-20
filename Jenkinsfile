pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sudo su -s sh "mvn --version"
                sudo su -s sh "mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
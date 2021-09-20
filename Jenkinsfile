pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sudo "mvn --version"
                sudo "mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
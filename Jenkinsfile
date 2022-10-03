pipeline {
  agent any
    tools {
        maven '3.6.3'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Zip File') {
            steps {
                sh 'cd/target/ zip my-app-1.0-SNAPSHOT.jar'
            }
        }
    }
}

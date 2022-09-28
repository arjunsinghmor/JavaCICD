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
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Publish') {
            steps {
                sh 'mvn clean'
            }
        }
    }
}

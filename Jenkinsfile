pipeline {
  agent any
    stages {
        stage('Build') {
            steps {
                  'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                  'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Publish') {
            steps {
                 'mvn clean deploy'
            }
        }
    }
}

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
        stage('Copy file') {
	    steps {
                sh 'cd /opt/TestingZip cp /opt/JavaApp/JavaCICD/target/my-app-1.0-SNAPSHOT.jar .'
            }
        }
    }
}

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
                sh 'cd /opt/JavaApp/JavaCICD/target cp -rf "my-app-1.0-SNAPSHOT.jar" /opt/TestingZip'
            }
        }
    }
}

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
			          sh 'ssh ec2-user@35.167.219.34'
				        sh 'sudo su-'
                sh 'cd /var/lib/jenkins/.m2/repository/com/mycompany/app/my-app/1.0-SNAPSHOT'
				        sh 'cp -rf my-app-1.0-SNAPSHOT.jar /opt/TestingZip'
            }
        }
    }
}

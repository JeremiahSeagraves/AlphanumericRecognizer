pipeline {
    agent any
    stages {
        stage('Build') {
            agent { docker 'maven:3.6.3-jdk-11-openj9' }
            steps {
                sh "echo Starting"
                sh 'apt-get update -y'
                sh 'apt-get upgrade -y'
                sh 'apt-get install git -y'
                echo 'Cloning repo'
                sh 'git clone https://github.com/JeremiahSeagraves/AlphanumericRecognizer.git'
                sh "ls"
                echo 'Repo cloned'
                echo 'Changing directory'
                dir ("AlphanumericRecognizer"){
                	dir("alphanumeric-recognizer-discovery"){
                	    echo 'Running mvn clean install'
                		sh 'mvn clean install'
                	}
                	sh 'docker images'
                	sh 'docker run -d -p 8761:8761 com.jeremiahseagraves.ai-alphanumeric-recognizer-discovery:1.0-SNAPSHOT'
                }
            }
        }
    }
    post {
        always {
            dir("${WORKSPACE}"){
                dir(".."){
                    sh 'rm -rf ${WORKSPACE}*'
                }
            }
        }
    }
}
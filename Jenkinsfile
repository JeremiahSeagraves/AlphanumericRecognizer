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
                echo "Installing docker compose"
                sh 'curl -L https://github.com/docker/compose/releases/download/1.21.2/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose'
                sh 'chmod +x /usr/local/bin/docker-compose'
                echo "Docker compose version"
                sh 'docker-compose --version'
                echo 'Cloning repo'
                sh 'git clone https://github.com/JeremiahSeagraves/AlphanumericRecognizer.git'
                sh "ls"
                echo 'Repo cloned'
                echo 'Changing directory'
                dir ("AlphanumericRecognizer"){
                    sh 'mvn clean install'
                	dir("alphanumeric-recognizer-app-angular"){
                	    echo 'Running docker build angular service'
                		sh 'docker build -t com.jeremiahseagraves.ai.alphanumeric-recognizer-app-angular .'
                	}
                	sh 'docker-compose up -d'
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
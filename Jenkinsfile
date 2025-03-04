pipeline {
    agent any

    environment {
        IMAGE_NAME = 'bank-app'
        IMAGE_TAG = 'latest'
        DOCKER_HUB_USER = 'sivachandrika'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/sivachandrika/Simple-Bank-Miniproject.git'
            }
        }
        
        stage('Build Application') {
            steps {
                sh 'mvn clean package'
                sh 'ls -l target/'  // Debugging: Ensure JAR file exists
            }
        }
        
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_HUB_USER/$IMAGE_NAME:$IMAGE_TAG .'
            }
        }
        
        stage('Push to Docker Hub') {
            steps {
                withDockerRegistry([credentialsId: 'docker-creds', url: '']) {
                    sh 'docker push $DOCKER_HUB_USER/$IMAGE_NAME:$IMAGE_TAG'
                }
            }
        }
        stage('Deploy Container') {
            steps {
            sh 'docker ps -q --filter "name=bank-app" | xargs -r docker stop'
            sh 'docker ps -aq --filter "name=bank-app" | xargs -r docker rm'
            sh 'docker run -d --name bank-app -p 9090:8080 $DOCKER_HUB_USER/$IMAGE_NAME:$IMAGE_TAG'
            }
        }
    }
}

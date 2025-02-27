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
                git 'https://github.com/yourrepo/bank-app.git'
            }
        }
        
        stage('Build Application') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_HUB_USER/$IMAGE_NAME:$IMAGE_TAG .'
            }
        }
        
        stage('Push to Docker Hub') {
            steps {
                withDockerRegistry([credentialsId: 'docker-hub-credentials', url: '']) {
                    sh 'docker push $DOCKER_HUB_USER/$IMAGE_NAME:$IMAGE_TAG'
                }
            }
        }
        
        stage('Deploy Container') {
            steps {
                sh 'docker run -d --name bank-app -p 8080:8080 $DOCKER_HUB_USER/$IMAGE_NAME:$IMAGE_TAG'
            }
        }
    }
}


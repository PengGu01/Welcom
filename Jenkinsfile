pipeline {
    agent any

    tools {
        maven 'M3'
        jdk 'JDK8'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t your-dockerhub-username/your-app-name .'
            }
        }

        stage('Push Image to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                        docker.image('your-dockerhub-username/your-app-name').push()
                    }
                }
            }
        }
    }
}

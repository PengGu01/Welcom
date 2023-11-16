pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS = credentials('docker')
    }

    stages {
        stage('Check out') {
            steps {
              git branch: 'main', url: 'https://github.com/PengGu01/Welcom.git'

            }
        }

        stage('Build Maven Project') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                script {
                    docker.build("myimage:${env.BUILD_ID}")
                }
            }
        }

        stage('Docker Login') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker') {
                    
                    }             
                }
            }
        }
        
         stage('Docker Push') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker') {
                        docker.image("pgu1@my.centennialcollege.ca/myimage:${env.BUILD_ID}}").push()
                    }      
                }
            }
        }
    }
}
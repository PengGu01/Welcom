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

         // 添加测试阶段
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}

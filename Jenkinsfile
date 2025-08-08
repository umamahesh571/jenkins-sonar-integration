pipeline {
    agent any
    environment {
        SONARQUBE_ENV = 'SonarQube' // Must match Jenkins SonarQube config name
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-repo/evolve-tech.git'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv("${SONARQUBE_ENV}") {
                    sh 'mvn clean verify sonar:sonar'
                }
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
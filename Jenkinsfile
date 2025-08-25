pipeline {
    agent any
    // tools {
    //     maven 'Maven3'   
    //     jdk   'JDK17'   
    // }
    //  triggers {
    //     pollSCM('* * * * *') // every 1 minute
    // }
    stages {
        stage('Checkout') {
            steps {
                 checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}

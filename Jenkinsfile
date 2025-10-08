pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo Building...'
                // For Maven: sh 'mvn clean install'
                // For Node: sh 'npm install && npm run build'
                 sh 'echo Building Changes for it Like '
            }
        }
        stage('Test') {
            steps {
                sh 'echo Testing...'
                // For Maven: sh 'mvn test'
                // For Node: sh 'npm test'
            }
        }
    }
}

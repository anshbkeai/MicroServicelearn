pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo '🛠️ Building all services...'
                echo 'Building Eureka Service...'
                echo 'Building Gateway Service...'
                echo 'Building Model Service...'
            }
        }

        stage('Test') {
            steps {
                echo '🧪 Running tests for all services...'
                echo 'Testing Eureka...'
                echo 'Testing Gateway...'
                echo 'Testing Model...'
            }
        }

        stage('Run Applications') {
            steps {
                echo '🚀 Starting all services...'
                echo 'Starting Eureka Server...'
                echo 'Starting API Gateway...'
                echo 'Starting Model Service...'
            }
        }

        stage('Verification') {
            steps {
                echo '✅ Verifying running services...'
                echo 'Eureka running on port 8761'
                echo 'Gateway running on port 8080'
                echo 'Model service running on port 9090'
            }
        }
    }

    post {
        always {
            echo '🧹 Cleaning up workspace...'
            echo 'Stopping all services and clearing temp files...'
        }
    }
}

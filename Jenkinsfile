pipeline {
    agent any

    stages {
        stage('Initialization') {
            steps {
                script {
                    echo 'Hello world'
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    echo 'Building...'
                    
                }
              deployerUtils()
            }
        }
    }

    post {
        always {
            // Cleanup workspace
            cleanWs()
        }
    }
}

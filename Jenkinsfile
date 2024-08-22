@Library(['my-shared-library']) _
// import com.example.StatusReporter

pipeline {
    agent any

    stages {
        stage('Initialization') {
            steps {
                script {
                    stageName = ''
                    sh 'echo "Hello world"'
                }
            }
        }
        stage('build') {
            steps {
                script {
                    stageName = 'build'       
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










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
            // post {
            //     success {
            //         script {
            //             StatusReporter.statusReporter('SUCCESS', stageName)
            //         }
            //     }
            //     failure {
            //         script {
            //             StatusReporter.statusReporter('FAILURE', stageName)
            //         }
            //     }
            //     unstable {
            //         script {
            //             StatusReporter.statusReporter('UNSTABLE', stageName)
            //         }
            //     }
            }
        }
    }
  }


@Library(['my-shared-library']) _

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
            post {
                success {
                    StatusReporter.statusReporter('SUCCESS', stageName)
                }
                failure {
                    StatusReporter.statusReporter('FAILURE', stageName)
                }
                unstable {
                    StatusReporter.statusReporter('UNSTABLE', stageName)
                }
            }
        }
    }
}

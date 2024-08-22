@Library(['my-shared-library'])
import groovy.json.JsonSlurper

pipeline {
    agent any

    stages{
        stage('Initialization'){
        steps {
            script {
            stageName = ''
            sh 'echo "Hello world"'
            }
        }

      }
      stage('build'){
        steps {
            script {
            stageName = 'build'
            deployerUtils()
            }
        }
        post {
            success {
                statusReporter('SUCCESS', stageName)

            }
            failure {
               statusReporter('FAILURE', stageName)

            }
            unstable {
              statusReporter('UNSTABLE', stageName)


            }

        }
      }


    }
}









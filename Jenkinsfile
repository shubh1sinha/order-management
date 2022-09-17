pipeline {
  environment {
    registry = "shubh1sinha/order-management"
    registryCredential = 'docker-cred'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/shubh1sinha/order-management.git'
      }
    }
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
        	post {
		always {
			bat 'docker logout'
		}
	}
  }
}
